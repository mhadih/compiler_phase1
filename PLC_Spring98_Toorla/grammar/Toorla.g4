grammar Toorla;


@header
{
    import toorla.ast.*;
    import toorla.ast.expression.*;
    import toorla.ast.expression.binaryExpression.*;
    import toorla.ast.expression.unaryExpression.*;
    import toorla.ast.expression.value.*;
    import toorla.ast.statement.*;
    import toorla.ast.statement.localVarStats.*;
    import toorla.ast.statement.returnStatement.*;
    import toorla.ast.declaration.*;
    import toorla.ast.declaration.classDecs.*;
    import toorla.ast.declaration.classDecs.classMembersDecs.*;
    import toorla.ast.declaration.localVarDecs.*;
    import toorla.types.*;
    import toorla.types.singleType.*;
    import toorla.types.arrayType.*;
}


@members
{
    int counter;
    void print()
    {
        System.out.println( "hello" );
    }
}

program returns [Program resProgram] locals [ArrayList<ClassDeclaration> tmpList] :
    list1=classStar
    newClass=entryClass
    list2=classStar
    {
        $tmpList = $list1.classList;
        $tmpList.add($newClass.resClass);
        $tmpList.addAll($list2.classList);
        for (int i = 0; i<$tmpList.size(); i++)
            $resProgram.addClass($tmpList.get(i));
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
    { $classList = new ArrayList<>(); }
    ;

classRole returns [ClassDeclaration resClass]:
    ('class' name=ID ':' { $resClass = new ClassDeclaration( new Identifier($name.text) ); }
    | 'class' name=ID 'inherits' parent=ID ':' { $resClass = new ClassDeclaration( new Identifier($name.text), new Identifier($parent.text) ); } )
//        body=classItemStar
//        {
//            $resClass.members = $body.members;
//        }
          (
          variables=field { $resClass.addFieldsDeclarations($variables.resField); }
          |
          func=method { $resClass.addMethodDeclaration($func.resMethod); }
          )*
    'end'
    ;

entryClass returns [EntryClassDeclaration resClass]:
    ('entry' 'class' name=ID ':' { $resClass = new EntryClassDeclaration( new Identifier($name.text) ); }
    | 'class' name=ID 'inherits' parent=ID ':' { $resClass = new EntryClassDeclaration( new Identifier($name.text), new Identifier($parent.text) ); } )
//        list1=classItemStar
//        main=mainFunc
//        list2=classItemStar
//        {
//            $resClass.members = $list1.members;
//            $resClass.members.add($main.main);
//            $resClass.members.addAll($list2.members);
//        }
        (
        variables=field { $resClass.addFieldsDeclarations($variables.resField); }
        |
        func=method { $resClass.addMethodDeclaration($func.resMethod); }
        |
        main=mainFunc { $resClass.addMethodDeclaration($main.main); }
        )*
     'end'
     ;

mainFunc returns [MethodDeclaration main]:                           /////need work
    ('public')? 'function' Main '()' 'returns' 'int' ':'
        body=funcBody
    {
        for (int i = 0; i<$body.statements.size(); i++)
            $main.addStatement($body.statements.get(i));
    }
    'end'
    ;

//classItemStar returns [ArrayList<ClassMemberDeclaration> members]:
//    variables=field list=classItemStar { $members = $list.members; $members.addAll(variables.resField); }
//    |
//    func=method list=classItemStar { $members = $list.members; $members.add(func.resMethod); }
//    |
//    //lamda
//    { $members = new ArrayList<>(); }
//    ;

method returns [MethodDeclaration resMethod]:        //// need work
    (access=access_modifier 'function' name=ID { $resMethod = new MethodDeclaration(new Identifier($name.text)); $resMethod.setAccessModifier($access.access); }
     | 'function' name=ID { $resMethod = new MethodDeclaration( new Identifier($name.text) ); } )
     '(' list=argumentList ')' 'returns' resType=type ':'
        body=funcBody
    'end'
    {
        for (int i = 0; i<$body.statements.size(); i++)
            $resMethod.addStatement($body.statements.get(i));
        $resMethod.setReturnType($resType.resType);
        for (int i = 0; i<$list.args.size(); i++)
            $resMethod.addArg($list.args.get(i));

    }
    ;

argumentList returns [ArrayList<ParameterDeclaration> args]:
    arg=argument list=argumentStar
    {
        $args = $list.argList;
        $args.add($arg.arg);
    }
    |
    //lamda//for empty argument list
    { $args = new ArrayList<>(); }
    ;

argumentStar returns [ArrayList<ParameterDeclaration> argList]: ///fixed :)
    ',' arg=argument args=argumentStar
    {
        $argList = $args.argList;
        $argList.add($arg.arg);
    }
    |
    //lamda
    {
        $argList = new ArrayList<>();
    }
    ;

argument returns [ParameterDeclaration arg]:
    name=ID ':' resType=type
    {
        $arg = new ParameterDeclaration(new Identifier($name.text), $resType.resType);
    }
    ;

field returns [List<FieldDeclaration> resField]:
    access=access_modifier 'field' vars=idPlus resType=type ';'
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType,$access.access));
    }
    | 'field' vars=idPlus resType=type ';'
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType));
    }
    ;

access_modifier returns [AccessModifier access]:
    'public' { $access = AccessModifier.ACCESS_MODIFIER_PUBLIC; }
    | 'private' { $access = AccessModifier.ACCESS_MODIFIER_PRIVATE; }
    ;

idPlus returns [ArrayList<Identifier> identifiers]:
    name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(new Identifier($name.text)); }
    ;

idStar returns [ArrayList<Identifier> identifiers]:
    ',' name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(new Identifier($name.text)); }
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
    | className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text)) ); }
    ;

nonPrimitiveType returns [Type resType]:
    'new' className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text))); }
    | 'new'  userDefined=singleType '[]' { $resType = new ArrayType($userDefined.resType); }
    ;

type returns [Type resType]:
    prmType=primitiveType { $resType = $prmType.resType; }
    | nnprmType=nonPrimitiveType { $resType = $nnprmType.resType; }
    ;

funcBody returns [ArrayList<Statement> statements]:
     statement1 = statementStar
    {
        $statements = $statement1.statements;
    }
    ;

statementStar returns [ArrayList<Statement> statements]:
    statement1=statement statement2=statementStar
    {
        $statements=$statement2.statements;
        $statements.add($statement1.resStatement);
    }
    | //lamda
    {   $statements= new ArrayList<>(); }
    ;

statement returns [Statement resStatement]:
    single=singleStatement ';' { $resStatement = $single.oneStatement; }
    | statement1 = block { $resStatement = $statement1.resBlock; }
    | statement2 = ifRole { $resStatement = $statement2.resIf; }
    | statement3 = whileRole { $resStatement = $statement3.resWhile; }
    ;

singleStatement returns [Statement oneStatement]: ///////////////need work

    ass=assign { $oneStatement = $ass.assignment; }
    | brk=breakRole { $oneStatement = $brk.resBreak; }
    | cnt=continueRole { $oneStatement = $cnt.resContinue; }
    | dc=dec { $oneStatement = $dc.resDec; }
    | ic=inc { $oneStatement = $ic.resInc; }
    | prt=printRole { $oneStatement = $prt.resPrint; }
    | rtn=returnRole { $oneStatement = $rtn.resReturn; }
    | dcl=declaration { $oneStatement = $dcl.defList; }
    | sState=singleStatement ';' { $oneStatement = $sState.oneStatement; }
    |
    //lamda
    { $oneStatement = new Skip(); }
    ;

declaration returns [LocalVarsDefinitions defList]:
    'var' def=assignID list=assignListStar
    {
        $defList = $list.defList;
        $defList.addVarDefinition($def.definition);
    }
    ;

assignListStar returns [LocalVarsDefinitions defList]:
    ',' def=assignID list=assignListStar
     {
        $defList = $list.defList;
        $defList.addVarDefinition($def.definition);
     }
     |
     //lamda
     { $defList = new LocalVarsDefinitions(); }
    ;

assignID returns [LocalVarDef definition]:
    name=ID '=' init=expression
    { $definition = new LocalVarDef(new Identifier($name.text), $init.expr); }
    ;

assign returns [Assign assignment]:
    expression1=expression '=' expression2=expression
    { $assignment = new Assign($expression1.expr,$expression2.expr); }
    ;

block returns [Block resBlock]:
    'begin'
        statement1=statementStar
        {
            $resBlock = new Block();
            for (int i = 0; i<$statement1.statements.size(); i++)
                $resBlock.addStatement($statement1.statements.get(i));
        }
    'end'
    ;

breakRole returns [Break resBreak]:
    'break'
    { $resBreak = new Break(); }
    ;

ifRole returns [Conditional resIf]:
    'if' '(' expr1=expression ')' then1=statement
    { $resIf = new Conditional($expr1.expr,$then1.resStatement); } //////////statement arry hastesh!!!
    |   'if' '(' expr2=expression ')' then2=statement 'else' elze=statement
    { $resIf = new Conditional($expr2.expr,$then2.resStatement,$elze.resStatement); }
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

continueRole returns [Continue resContinue]:
    'continue'
    { $resContinue = new Continue(); }
    ;

dec returns[DecStatement resDec]:
    expr=expression '--'
    { $resDec = new DecStatement($expr.expr);}
    ;

inc returns[IncStatement resInc] :
    expr=expression '++'
    { $resInc = new IncStatement($expr.expr); }
    ;

printRole returns [PrintLine resPrint]:
    'print' '(' arg=expression ')'
    { $resPrint = new PrintLine($arg.expr); }
    ;

returnRole returns [Return resReturn]:
    'return' expr=expression
    { $resReturn =  new Return($expr.expr); }
    ;

whileRole returns [While resWhile]:
    'while' '(' expr=expression ')'
        state=statement
     { $resWhile = new While($expr.expr,$state.resStatement); }
     ;

expression returns[Expression expr ]:
    expressionl1 = expressionL1 { $expr= $expressionl1.expr; }
    | expressionl1=expressionL1 '||' expressionr=expression
    { $expr = new Or($expressionl1.expr,$expressionr.expr); }
    ;

expressionL1 returns[Expression expr ]:
    expressionl2=expressionL2 { $expr=$expressionl2.expr; }
    | expressionl2=expressionL2 '&&' expressionl1=expressionL1
    { $expr = new And($expressionl2.expr,$expressionl1.expr); }
    ;

expressionL2 returns[Expression expr ]:
    expressionl3=expressionL3 { $expr=$expressionl3.expr; }
    | expressionl3=expressionL3 '==' expressionl2=expressionL2
    { $expr = new Equals($expressionl3.expr, $expressionl2.expr); }
    | expressionl3=expressionL3 '<>' expressionl2=expressionL2
    { $expr = new NotEquals($expressionl3.expr, $expressionl2.expr); }
    ;

expressionL3 returns [Expression expr]:
    expressionl4=expressionL4 { $expr=$expressionl4.expr; }
    |expressionl4=expressionL4 '<' expressionl3=expressionL3
    { $expr = new LessThan($expressionl4.expr,$expressionl3.expr); }
    |expressionl4=expressionL4 '>' expressionl3=expressionL3
    { $expr = new GreaterThan($expressionl4.expr,$expressionl3.expr); }
    ;

expressionL4 returns [Expression expr]:
    expressionl5=expressionL5 { $expr=$expressionl5.expr; }
    |expressionl5=expressionL5 '+' expressionl4=expressionL4
    { $expr = new Plus($expressionl5.expr,$expressionl4.expr); }
    |expressionl5=expressionL5 '-' expressionl4=expressionL4
    { $expr = new Minus($expressionl5.expr,$expressionl4.expr); }
    ;

expressionL5 returns [Expression expr]:
    expressionl6=expressionL6 { $expr=$expressionl6.expr; }
    |expressionl6=expressionL6 '/' expressionl5=expressionL5
    { $expr = new Division($expressionl6.expr,$expressionl5.expr); }
    |expressionl6=expressionL6 '*' expressionl5=expressionL5
    { $expr = new Times($expressionl6.expr,$expressionl5.expr); }
    |expressionl6=expressionL6 '%' expressionl5=expressionL5
    { $expr = new Modulo($expressionl6.expr,$expressionl5.expr); }
    ;

expressionL6 returns [Expression expr]:
    expressionl7=expressionL7 { $expr=$expressionl7.expr; }
    | '!' expressionl6=expressionL6
    {$expr= new Not( $expressionl6.expr); }
    | '-' expressionl6=expressionL6
    {$expr= new Neg( $expressionl6.expr); }
    ;

expressionL7 returns [Expression expr]:
    sExpr=singleExpression { $expr = $sExpr.expr; }
    |'(' inExpr=expression ')' { $expr = $inExpr.expr; }
    ;

singleExpression returns [Expression expr]:
      name = ID { $expr = new Identifier($name.text); }
    | number = NUMBER { $expr = new IntValue($number.int); }
    | stringCons = STRINGCONST  { $expr = new StringValue($stringCons.text); }
    | bool = BoolValue { $expr = new BoolValue(($bool.text == "false") ? false : true ); }
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

Bool: 'bool'
    ;

BoolValue:
    'false' | 'true'
    ;

KEYWORD:
    'if' | 'else' | 'string' | 'int' | 'class' | 'function'
    | 'print' | 'private' | 'field' | 'self' | 'while'
    | 'new' | 'return' | 'elif' | 'returns' | 'break' | 'countine' | 'entry'
    | 'begin' | 'end' | 'public' | 'var' | 'inherits'
    ;


//SPECIAL
//    :   ':' | '+' | '-' | '*' | '/' | '!' | '%] | [&&] | [||] | [=] | [==] | [,]
//      | [[] | [.] | [!] | [<] | [>]
//    ;