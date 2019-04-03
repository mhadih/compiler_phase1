grammar ToorlaGrammar;


@header
{
    import toorla.ast.*;
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
    classStar entryClass classStar
    ;

classStar:
    classRole classStar | //lamda
    ;

classRole:
    'class' ID ('inherits' ID)? ':'
        classBody
    'end'
    ;

entryClass:
    'entry' 'class' ID ('inherits' ID)? ':'
        classItemStar
        mainFunc
        classItemStar
     'end'
     ;

mainFunc:
    ('public')? 'function' Main '()' 'returns' 'int' ':'
        funcBody
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
    argument argumentStar | //lamda
    ;

argumentStar:
    ',' argument argumentStar | //lamda
    ;

argument:
    ID ':' type
    ;

funcBody:
    statementStar
    ;

statementStar:
    statement statementStar | //lamda
    ;

statement:
    singleStatement ';' | block | ifRole | whileRole
    ;

singleStatement:
    assign | breakRole | continueRole | dec | inc | printRole | returnRole | declaration | singleStatement ';' | //lamda
    ;

declaration:
    'var' assignListPlus
    ;

assignListPlus:
    assignID assignListStar
    ;

assignListStar:
    ',' assignID assignListStar | //lamda
    ;

assignID:
    ID '=' expression
    ;

assign:
    expression '=' expression
    ;

block:
    'begin'
        statementStar
    'end'
    ;

breakRole:
    'break'
    ;

ifRole:
    'if' '(' expression ')' statement |
    'if' '(' expression ')' statement 'else' statement
    ;

//if:
//    matched | unmatched
//    ;
//
//matched:
//    'if' '(' expression ')' matched 'else' matched
//    ;
//
//unmatched:
//    'if' '(' expression ')' statement |
//    'if' '(' expression ')' matched 'else' unmatched
//    ;

continueRole:
    'continue'
    ;

dec:
    expression '--'
    ;

inc:
    expression '++'
    ;

printRole:
    'print' '(' (ID | STRINGCONST | NUMBER) ')'
    ;

returnRole:
    'return' expression
    ;

whileRole:
    'while' '(' expression ')'
        statement
     ;

expression:
    expressionL1 |
    expressionL1 '||' expressionL1
    ;

expressionL1:
    expressionL2 |
    expressionL2 '&&' expressionL1
    ;

expressionL2:
    expressionL3 |
    expressionL3 ( '==' | '<>' ) expressionL2
    ;

expressionL3:
    expressionL4 |
    expressionL4 ( '>' | '<' ) expressionL3
    ;

expressionL4:
    expressionL5 |
    expressionL5 ( '-' | '+' ) expressionL4
    ;

expressionL5:
    expressionL6 |
    expressionL6 ( '/' | '*'  | '%' ) expressionL5
    ;

expressionL6:
    expressionL7 |
    ( '-' | '!' ) expressionL6
    ;

expressionL7:
    singleExpression |
    '(' singleExpression ')'
    ;

singleExpression:
    ID | NUMBER | STRINGCONST
    ;

Main:
    'main'
    ;

ID:
    LETTER (LETTER | NUMBER)*
    ;

LETTER:
    [a-z] | [A-Z]
    ;


STRINGCONST:
    '"' CHARACTER (CHARACTER)* '"'
    ;

NUMBER:
    [1-9][0-9]* | [0]
    ;

CHARACTER:
    [a-z] | [A-Z] | [-] | [+]
    ;

WS:
    [ \t\n] -> skip
    ;

KEYWORD:
    'if' | 'else' | 'bool' | 'string' | 'int' | 'class' | 'function'
    | 'print' | 'private' | 'field' | 'self' | 'false' | 'true' | 'while'
    | 'new' | 'return' | 'elif' | 'returns' | 'break' | 'countine' | 'entry'
    | 'begin' | 'end' | 'public' | 'var' | 'inherits'
    ;


SPECIAL
    :   [:] | [+] | [-] | [*] | [/] | [!] | [%] | [&&] | [||] | [=] | [==] | [,]
      | [[] | [.] | [!] | [<] | [>]
    ;