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
        $statements = $statement1.arraystatements;
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

statement returns [ArrayList<Statement> statements]: ////  need work
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
    | inc
    | printRole
    | returnRole
    | declaration
    | singleStatement ';'
    | //lamda
    ;

declaration:                     ////////////neeed work
    'var' assignListPlus
    ;

assignListPlus:                     ////////////neeed work
    assignID assignListStar
    ;

assignListStar:                     ////////////neeed work
    ',' assignID assignListStar | //lamda
    ;

assignID:                                       /////////mesle baedi mishe??
    ID '=' expression
    ;

assign returns [Assign assignment]:
    expresson1=expression '=' expression2=expression
    {$assignment = new Assign(expression1.expr,expresson2.expr);}
    ;

block returns [ArrayList <statement> statements]:
    'begin'
        statemets1=statementStar { $statements = $statements1.arraystatements;}
    'end'
    ;

breakRole returns [Break break]:            //////////need work
    'break'
    ;

ifRole returns [Conditional ifCondition]:
    'if' '(' expre=expression ')' then=statement
    {$ifCondition = new Conditional(expre.expr,then); } //////////statement arry hastesh!!!
    |   'if' '(' expression ')' statement 'else' statement
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

continueRole returns [Continue continue]:                   ////need work
    'continue'
    ;

dec returns[DecStatement decs]:
    expression1=expression '--'
    {#decs = new DecStatement(expression1.expr);}
    ;

inc returns[IncStatement incs] :
    expression1=expression '++'
    {$incs = new IncStatement(expresson1.expr); }
    ;

printRole:                      /////////////need work
    'print' '(' singleExpression ')'
    ;

returnRole returns [Return return]:
    'return' expression1=expression
    {$return =  new Return(expression1.expr);}
    ;

whileRole returns [While while]:
    'while' '(' expression1=expression ')'
        statement1=statement
     { $while = new While(expression1.expr,statement1.statement);}
     ;

expression returns[Expression expr ]:
    expressionl1 = expressionL1 { $expr= $expressionl1.expr; }
    | expressionl1=expressionL1 '||' expressionll1=expressionL1
    { $expr = new Or(expressionl1.expr,expressionll1.expr); }
    ;

expressionL1 returns[Expression expr ]:
    expressionl2=expressionL2 {$expr=$expressionl2.expr; }
    | expressionl2=expressionL2 '&&' expressionl1=expressionL1
    { $expr = new And(expressionl2.expr,expressionl1.expr; }
    ;

expressionL2 returns[Expression expr ]:
    expressionl3=expressionL3 {$expr=$expressionl3.expr; }
    | expressionl3=expressionL3 '==' expressionll3=expressionL2
    { $expr = new Equals(expressionl3.expr,expressionl2.expr; }
    | expressionl3=expressionL3 '<>' expressionll3=expressionL2
    { $expr = new NotEquals(expressionl3.expr,expressionl2.expr; }
    ;

expressionL3 returns [Expression expr]:
    expressionl4=expressionL4 {$expr=$expressionl4.expr;}
    |expressionl4=expressionL4 '<' expressionl3=expressionL3
    { $expr = new LessThan(expressionl4.expr,expressionl3.expr; }
    |expressionl4=expressionL4 '>' expressionl3=expressionL3
    { $expr = new GreaterThan(expressionl4.expr,expressionl3.expr; }
    ;

expressionL4 returns [Expression expr]:
    expressionl5=expressionL5 {$expr=$expressionl5.expr;}
    |expressionL5 '+' expressionL4
    { $expr = new Plus(expressionl5.expr,expressionl4.expr; }
    |expressionL5 '-' expressionL4
    { $expr = new Minus(expressionl5.expr,expressionl4.expr; }
    ;

expressionL5 returns [Expression expr]:
    expressionl6=expressionL6 {$expr=$expressionl6.expr;}
    |expressionl6=expressionL6 '/' expressionl5=expressionL5
    { $expr = new Modulo(expressionl6.expr,expressionl5.expr; }
    |expressionl6=expressionL6 '*' expressionl5=expressionL5
    { $expr = new Times(expressionl6.expr,expressionl5.expr; }
    |expressionl6=expressionL6 '%' expressionl5=expressionL5
    { $expr = new Division(expressionl6.expr,expressionl5.expr; }
    ;

expressionL6 returns [Expression expr]:
    expressionl7=expressionL7 {$expr=expressoinl7.expr:}
    | '!' expressionl6=expressionL6
    {$expr= new Not(expressionl6.expr);}
    | '-' expressionl6=expressionL6
    {$expr= new Neg(expressionl6.expr);}
    ;

expressionL7 returns [Expression expr]:
    singleexpression=singleExpression {$singleexpression.expr;}
    |'(' singleExpression ')' {$singleexpression.expr;}                           ////////////////////okey???????????????
    ;

singleExpression returns [Expression expr]:                                                             /// need work
      name = ID { $expr = $expr.setName(name);}
    | number = NUMBER
    | stringCons = STRINGCONST  { $expr = $expr.setName(stringCons);}
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