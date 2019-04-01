grammar ToorlaWithAction;


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

program returns [Program resProgram]:
    list1=classStar
    newClass=entryClass
    list2=classStar
    {
        $resProgram.classes = $list1.classList;
        $resProgram.classes.add($newClass);
        $resProgram.classes.addAll($list2.classList);
    }
    ;

classStar returns [ArrayList<ClassDeclaration> classList]:
    newClass=classRole
    list=classStar
    {
        $classList = $list.classList;
        $classList.add($newClass.resClass);
    }
    |
    //lamda
    ;

classRole returns [ClassDeclaration resClass]:
    ('class' name=ID ':' { $resClass = new ClassDeclaration($name); }
    | 'class' name=ID 'inherits' parent=ID ':' { $resClass = new ClassDeclaration($name, $parent); } )
        body=classItemStar
        {
            $resClass.members = $body.members;
        }
    'end'
    ;

entryClass returns [EntryClassDeclaration resClass]:
    ('entry' 'class' name=ID ':' { $resClass = new ClassDeclaration($name); }
    | 'class' name=ID 'inherits' parent=ID ':' { $resClass = new ClassDeclaration($name, $parent); } )
        list1=classItemStar
        mainfunc=mainFunc
        list2=classItemStar
        {
            $resClass.members = $list1.members;
            $resClass.members.add(mainFunc.main);
            $resClass.members.addAll($list2..members);
        }
     'end'
     ;

mainFunc returns [MethodDeclaration main]:                           /////need work
    ('public')? 'function' Main '()' 'returns' 'int' ':'
        body=funcBody
    {
        for (int i = 0; i,$body.statements.size(); i++)
            $resMethod.addstatement(body.statements.get(i));
    }
    'end'
    ;

classItemStar returns [ArrayList<ClassMemberDeclaration> members]:
    variables=field list=classItemStar { $members = $list.members; $members.addAll(variables.resField); }
    |
    func=method list=classItemStar { $members = $list.members; $members.add(func.resMethod); }
    |
    //lamda
    { $members = new ArrayList<>(); }
    ;

method returns [MethodDeclaration resMethod]:        //// need work
    (access=access_modifier 'function' name=ID { $resMethod = new MethodDeclaration(name); setAccessModifier($access.access); }
     | 'function' name=ID { $resMethod = new MethodDeclaration(name); } )
     '(' list=argumentList ')' 'returns' resType=type ':'
        body=funcBody
    'end'
    {
        for (int i = 0; i,$body.statements.size(); i++)
            $resMethod.addstatement(body.statements.get(i));
        $resMethod.setReturnType($resType.resType);
        for (int i = 0; i<$list.args.size(); i++)
            $resMethod.addArg(list.args.get(i));

    }
    ;

argumentList returns [ArrayList<ParameterDeclaration> args]:
    arg=argument list=argumentStar
    {
        $args = $list.argList;
        $args.add(arg.argument);
    }
    |
    //lamda //for empty argument list
    { $args = new ArrayList<>(); }
    ;

argumentStar returns [ArrayList<ParameterDeclaration> Args]: ///fixed :)
    ',' arg=argument args=argumentStar
    {
        $Args = $args.argList;
        $Args.add(arg.arg);
    }
    |
    //lamda
    {
        $Args = new ArrayList<>();
    }
    ;

argument returns [ParameterDeclaration arg]:
    name=ID ':' resType=type
    {
        $arg = new ParameterDeclaration(name, resType); ////////////// resType.resType ???
    }
    ;

field returns [ArrayList<FieldDeclaration> resField]:
    access=access_modifier 'field' vars=idPlus resType=type ';'
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType,$access.access))
    }
    | 'field' vars=idPlus resType=type ';'
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType))
    }
    ;

access_modifier returns [AccessModifier access]:
    'public' { $access = ACCESS_MODIFIER_PUBLIC; }
    | 'private' { $access = ACCESS_MODIFIER_PRIVATE; }
    ;

idPlus returns [ArrayList<String> identifiers]:
    name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(name); }
    ;

idStar returns [ArrayList<String> identifiers]:
    ',' name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(name); }
    |
    //lamda
    { $identifiers = new ArrayList<>(); }
    ;

primitiveType returns [SingleType resType]:
    'int' { $resType = new IntType(); }
    | 'string' { $resType = new StringType(); }
    | 'bool'{ $resType = new BoolType(); }
    ;

singleType returns [SingleType resType]:
    prmType=primitiveType { $resType = $prmType.resType; }
    | className=ID { $resType = new UserDefined(className); }
    ;

nonPrimitiveType returns [Type resType]:
    'new' className=ID
    | 'new'  userDefined=singleType '[]' { $resType = new ArrayType($userDefined.resType); }
    ;

type returns [Type resType]:
    prmType=primitiveType { $resType = $prmType.resType; }
    | nnprmType=nonPrimitiveType { $resType = $nnprmType.resType; }
    ;

funcBody returns [ArrayList<Statement> statements]:

     statement1 = statementStar
    {
        $statements = $statment1.arraystatements;
    }
    ;

statementStar returns [ArrayList<Statement> arraystatements]:
    statement1=statement statement2=statementStar
    {
        $arraystatements=statement1;
        $arraystatements.add(statement2); //////////nabaiad for zad va done done add kard??
    }
    | //lamda
    {   $arraystatements= new ArrayList<>(); }
    ;

statement returns [ArrayList<Statement> statements]:
    single=singleStatement ';' { $statements.add( $single.statement); }
    | statement1 = block { $statements = $statement1.statements); }
    | statement2 = ifRole { $statements = $statement2.statements); }
    | statement3 = whileRole { $statements = $statement3.statements); }
    ;

singleStatement returns [Statement oneStatement]:

    assign
    | breakRole
    | continueRole
    | dec
    | inc //expression ?
    | printRole
    | returnRole
    | declaration
    | singleStatement ';'
    | //lamda
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

block returns [ArrayList <statement> statements]:
    'begin'
        statemets1=statementStar { $statement = $statements1;}
    'end'
    ;

breakRole:
    'break'
    ;

ifRole:                             ///////////HAME STATEMNET DARE HAM EXPRESSION ?
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

singleExpression returns [Expression expr]:  /// need work
      name = ID { $expr = new expr.Identifier(name);}
    | number = NUMBER
    | stringCons = STRINGCONST  { $expr = new expr.Identifier(stringCons);}
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