grammar test;


program:
    'function' ID '(' argumentList')';

argumentList:
    ID | //lamda
    ;

ID:
    LETTER (LETTER | NUMBER)*
    ;

//INTEGERCONST
//    :   NUMBER
//    ;

STRINGCONST:
    ["] LETTER (LETTER)* ["]
    ;

LETTER:
    [a-z] | [A-Z]
    ;

NUMBER:
    [1-9][0-9]* | [0]
    ;

WS:
    [ \t\n] -> skip
    ;

KEYWORD:
    [if] | [else] | [bool] | [string] | [int] | [class] | [function]
    | [print] | [private] | [field] | [self] | [false] | [true] | [while]
    | [new] | [return] | [elif] | [returns] | [break] | [countine] | [entry]
    | [begin] | [end] | [public] | [var] | [inherits]
    ;
//
//SPECIAL
//    :   [+] | [-] | [*] | [/] | [!] | [%] | [&&] | [||] | [=] | [==] | [,]
//      | [[] | []] | [.] | [!] | [<] | [>]
//    ;