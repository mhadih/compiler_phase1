grammar AS_EXPR_EVAL;


program
    :    finalResult=additionExp EOF
         {
            System.out.println( "final result is " + $finalResult.result );
         }
    ;

additionExp returns[ int result ]
    :    firstOperand=multiplyExp
         {
            $result = $firstOperand.result;
         }
         finalResult=temp_addition [ $result ]
         {
            $result = $finalResult.result;
         }
    ;


temp_addition[ int operand ] returns[ int result ] :
    op=( '+' | '-' )
    multResult=multiplyExp
    {
            if( $op.text.equals( "+" ) )
                $result = $operand + $multResult.result;
            else if( $op.text.equals( "-" ) )
                $result = $operand - $multResult.result;

    }
    tempAddResult=temp_addition[ $result ]
    {
        $result = $tempAddResult.result;
    }
    |
    {
        $result = $operand;
    }

;
multiplyExp returns[ int result ]
    :    firstOperand=atomExp
         {
            $result = $firstOperand.result;
         }
         ( '*' rightOperand=atomExp
         {
            $result *= $rightOperand.result;
         }
         | '/' rightOperand=atomExp
         {
             $result /= $rightOperand.result;
         }
         )*
    ;

atomExp returns[ int result ]
    :    numVal=NUMBER
    {
        $result = $numVal.int;
    }
    |    '(' paraResult=additionExp ')'
    {
        $result = $paraResult.result;
    }
    ;


NUMBER
    :    [1-9][0-9]* | [0]
    ;

WS: [ \t\n] -> skip
;