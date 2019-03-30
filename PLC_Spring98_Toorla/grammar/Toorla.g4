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

program:
    classStar enrtyClass classStar;

classStar:
    class classStar | //lamda
    ;

class:
    'class' ID ('inherits' ID)? ':'
        classBody
    'end'
    ;

classBody:
    ( field | method ) classItemStar
    ;

classItemStar:
    ( field | method ) classItemStar | //lamda
    ;

field:
    access_modifier? 'field' idPlus type ';'
    ;

access_modifier:
    'public' | 'private'
    ;

idPlus:
    ID idStar
    ;

idStar:
    ',' ID idStar | //lamda
    ;

primitiveType:
    'int' | 'string' | 'bool'
    ;

type:
    primitiveType | type'['']'
    ;

method:
    (access_modifier)? 'function' ID '(' argumentList ')' 'returns' type ':'
        funcBody
    'end'
    ;

argumentList:
    argument tmpArgument
    ;

tmpArgument:
    ',' argument tmpArgument | //lamda
    ;

argument:
    ID ':' type
    ;

funcBody:
    statmentStar
    ;

statmentStar:
    statment statmentStar | //lamda
    ;

ID
    :   LETTER (LETTER | NUMBER)*
    ;

//INTEGERCONST
//    :   NUMBER
//    ;

STRINGCONST
    :   LETTER (LETTER)*
    ;

LETTER
    :   [a-z] | [A-Z]
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