grammar Toorla;



@header
{
    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.expression.*;
    import toorla.ast.statement.*;
}


@members
{
    int counter;
    void print()
    {
        System.out.println( "hello" );
    }
}

program returns[ Expression expression]
    :    expr=additionExp
    {
        $expression = $expr.expression;
        System.out.println( counter );
        print();
    }
    ;

additionExp returns[ Expression expression ]

    :    first=multiplyExp finalExpr=temp_add[ $first.expression ]
         {
            $expression = $finalExpr.expression;
         }
    ;


temp_add[ Expression operand ] returns[ Expression expression ] locals[ BinaryExpression immediateExpression ]:
    operator=( '+' | '-' )
    second=multiplyExp
    {
           if( $operator.text.equals( "+" ) )
                $immediateExpression = new Plus( $operand , $second.expression );
           else if( $operator.text.equals( "-" ) )
                $immediateExpression = new Minus( $operand , $second.expression );
    }
    finalExpr=temp_add[ $immediateExpression ]
    {
        $expression = $finalExpr.expression;
    }
    |
    {
        $expression = $operand;
    }



    ;

multiplyExp returns[ Expression expression ] locals[ BinaryExpression immediate ]
    :    first=atomExp
         {
            $expression = $first.expression;
         }
         (
             '*' second=atomExp
             {
                $immediate = new Times( $expression , $second.expression );
                $expression = $immediate;
             }
             |
             '/' second=atomExp
             {
                $immediate = new Division( $expression , $second.expression );
                $expression = $immediate;
             }
         )*
    ;

atomExp returns[ Expression expression ]
    :    value=NUMBER
    {
        $expression = new IntValue( $value.int );
    }
    |    leftPara='(' expr=additionExp ')'
    {
        $expression = $expr.expression;
    }
    ;



IDENT
    :   LETTER (LETTER | DIGIT)*
    ;

INTEGERCONST
    :   NUMBER
    ;

STRINGCONST
    :   LETTER (LETTER)*
    ;

LETTER
    :   [a-z] | [A-Z]
    ;

DIGIT
    : [0-9]
    ;

NUMBER
    :    [1-9][0-9]* | [0]
    ;

WS: [ \t\n] -> skip
    ;

KEYWORD
    :   [if] | [else] | [bool] | [string] | [int] | [class] | [function]
      | [print] | [private] | [field] | [self] | [false] | [true] | [while]
      | [new] | [return] | [elif] | [returns] | [break] | [countine] | [entry]
      | [begin] | [end] | [public] | [var] | [inherits]
     ;
//
//SPECIAL
//    :   [+] | [-] | [*] | [/] | [!] | [%] | [&&] | [||] | [=] | [==] | [,]
//      | [[] | []] | [.] | [!] | [<] | [>]
//    ;