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


program returns [Program resProgram] locals [ArrayList<ClassDeclaration> tmpList]
    @init{
        $resProgram = new Program();
    } :

    ( class1=classRole
        { $resProgram.addClass($class1.resClass); } ) *
    class2=entryClass { $resProgram.addClass($class2.resClass); }
    ( class3=classRole
    { $resProgram.addClass($class3.resClass); } )*
    ;

classRole returns [ClassDeclaration resClass]:                                                              //////need work
    (CLASS name=ID COLON { $resClass = new ClassDeclaration( new Identifier($name.text) ); $resClass.line=$CLASS.getLine(); }
    | CLASS name=ID INHERITS parent=ID COLON { $resClass = new ClassDeclaration( new Identifier($name.text), new Identifier($parent.text) );
        $resClass.line=$CLASS.getLine();} )
          (
          variables=field { $resClass.addFieldsDeclarations($variables.resField); $resClass.line=$variables.start.getLine(); }
          |
          func=method { $resClass.addMethodDeclaration($func.resMethod); $resClass.line=$func.start.getLine(); }
          )*
    END
    ;

entryClass returns [EntryClassDeclaration resClass]:
    (ENTRY  CLASS name=ID COLON { $resClass = new EntryClassDeclaration( new Identifier($name.text) ); $resClass.line= $ENTRY.getLine();}
    | ENTRY  CLASS name=ID INHERITS parent=ID COLON { $resClass = new EntryClassDeclaration( new Identifier($name.text), new Identifier($parent.text) );
     $resClass.line= $ENTRY.getLine();} )

         (
            variables=field { $resClass.addFieldsDeclarations($variables.resField); $resClass.line=$variables.start.getLine();
            }
            |
            func=method { $resClass.addMethodDeclaration($func.resMethod); $resClass.line=$func.start.getLine();
            }
//            |
//            main=mainFunc { $resClass.addMethodDeclaration($main.main);
//             $resClass.line=$main.start.getLine(); }
         )*
     END
     ;

//mainFunc returns [MethodDeclaration main]:                           /////need work
//    (PUBLIC)? FUNCTION 'main' LPAR RPAR RETURNS INT COLON
//        body=funcBody
//    {
//        $main = new MethodDeclaration(new Identifier("main"));
//        for (int i = 0; i<$body.statements.size(); i++)
//            $main.addStatement((Statement)$body.statements.get(i));
//        $main.line=$FUNCTION.getLine();
//    }
//    END
//    ;

method returns [MethodDeclaration resMethod]:
    (access=access_modifier FUNCTION name=ID { $resMethod = new MethodDeclaration(new Identifier($name.text)); $resMethod.setAccessModifier($access.access);
     $resMethod.line=$FUNCTION.getLine(); }
     | FUNCTION name=ID { $resMethod = new MethodDeclaration( new Identifier($name.text) ); $resMethod.line=$FUNCTION.getLine(); } )
     LPAR list=argumentList RPAR RETURNS resType=type COLON
        body=funcBody
    END
    {
        for (int i = 0; i<$body.statements.size(); i++)
            $resMethod.addStatement($body.statements.get(i));
        $resMethod.setReturnType($resType.resType);
        for (int i = 0; i<$list.args.size(); i++)
            $resMethod.addArg($list.args.get(i));
        $resMethod.line=$END.getLine();
    }
    ;

argumentList returns [ArrayList<ParameterDeclaration> args]
    @init
    {
        $args = new ArrayList<>();
    }:
    arg1=argument { $args.add($arg1.arg); }
    ( COMMA arg2=argument
        { $args.add($arg2.arg); } )*
    |
    //lamda //for empty argument list
    ;

argument returns [ParameterDeclaration arg]:
    name=ID COLON resType=type
    {
        $arg = new ParameterDeclaration(new Identifier($name.text), $resType.resType);
    }
    ;

field returns [List<FieldDeclaration> resField]:
    access=access_modifier FIELD vars=idPlus resType=type SEMICOLON
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType,$access.access));
    }
    | FIELD vars=idPlus resType=type SEMICOLON
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType));
    }
    ;

access_modifier returns [AccessModifier access]:
    PUBLIC { $access = AccessModifier.ACCESS_MODIFIER_PUBLIC;}
    | PRIVATE { $access = AccessModifier.ACCESS_MODIFIER_PRIVATE;}
    ;

idPlus returns [ArrayList<Identifier> identifiers]
    @init
    {
        $identifiers = new ArrayList<>();
    }:
    name1=ID { $identifiers.add(new Identifier($name1.text)); }
    ( COMMA name2=ID { $identifiers.add(new Identifier($name2.text)); } )*
    ;

primitiveType returns [SingleType resType]:
    INT { $resType = new IntType(); }
    | STRING     { $resType = new StringType(); }
    | Bool{ $resType = new BoolType(); }
    ;

singleType returns [SingleType resType]:
    prmType=primitiveType { $resType = $prmType.resType; }
    | className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text)) );  }
    ;

nonPrimitiveType returns [Type resType]:
    className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text)));}
    | userDefined=singleType '[' ']' { $resType = new ArrayType($userDefined.resType); }
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

statementStar returns [ArrayList<Statement> statements]
    @init{
        $statements= new ArrayList<>();
    }
    :
    (statement1=statement
    {
          $statements.add($statement1.resStatement);
    } )*
    ;

statement returns [Statement resStatement]:
    statement1 = openStatement { $resStatement = $statement1.resStatement; $resStatement.line= $statement1.start.getLine();}
    | statement2 = closedStatement { $resStatement = $statement2.resStatement; $resStatement.line= $statement2.start.getLine(); }
    ;

openStatement returns [Statement resStatement]:
    statement1 = block { $resStatement = $statement1.resBlock; $resStatement.line=$statement1.start.getLine(); }
    | statement2=ifOpen { $resStatement = $statement2.resIf; $resStatement.line=$statement2.start.getLine(); }
    | statement3=whileOpen { $resStatement = $statement3.resWhile; $resStatement.line=$statement3.start.getLine(); }
    ;

closedStatement returns [Statement resStatement]:
    sState=singleStatement { $resStatement = $sState.oneStatement; $resStatement.line=$sState.start.getLine(); }
    | statement1 = block { $resStatement = $statement1.resBlock; $resStatement.line=$statement1.start.getLine(); }
    | statement2=ifClose { $resStatement = $statement2.resIf; $resStatement.line=$statement2.start.getLine(); }
    | statement3=whileClose { $resStatement = $statement3.resWhile; $resStatement.line=$statement3.start.getLine(); }
    ;

whileOpen returns [While resWhile]:
    WHILE LPAR expr=expression RPAR
        state=openStatement
     { $resWhile = new While($expr.expr,$state.resStatement); $resWhile.line=$WHILE.getLine(); }
    ;

whileClose returns [While resWhile]:
    WHILE LPAR expr=expression RPAR
        state=closedStatement
     { $resWhile = new While($expr.expr,$state.resStatement); $resWhile.line=$WHILE.getLine(); }
    ;

ifClose returns [Conditional resIf] locals [Conditional tmpCon]:
    IF LPAR expr=expression RPAR then=closedStatement
    elifAndElsePlusClose
    { $resIf = new Conditional($expr.expr,$then.resStatement,$elifAndElsePlusClose.resIf); }
    ;

ifOpen returns [Conditional resIf]:
    IF LPAR expr1=expression RPAR then1=statement
    { $resIf = new Conditional($expr1.expr,$then1.resStatement,new Skip()); $resIf.line=$IF.getLine(); }
    | IF LPAR expr2=expression RPAR then2=closedStatement
    elifAndElsePlusOpen
    { $resIf = new Conditional($expr2.expr,$then2.resStatement,$elifAndElsePlusOpen.resIf); $resIf.line=$IF.getLine(); }
    ;

elifAndElsePlusClose returns [Statement resIf]:
    'elif' '(' expression ')'
        closedStatement
    elifAndElsePlusClose
    { $resIf = new Conditional($expression.expr,$closedStatement.resStatement,$elifAndElsePlusClose.resIf); }
    |
    ( 'elif' '(' expression ')'
        closedStatement { $resIf = new Conditional($expression.expr,$closedStatement.resStatement,new Skip()); }
        | 'else' closedStatement { $resIf = $closedStatement.resStatement; } )
    ;

elifAndElsePlusOpen returns [Statement resIf]:
    'elif' '(' expression ')'
        closedStatement
    elifAndElsePlusOpen
    { $resIf = new Conditional($expression.expr,$closedStatement.resStatement,$elifAndElsePlusOpen.resIf); }
    |
    ( 'elif' '(' expression ')'
        openStatement { $resIf = new Conditional($expression.expr,$openStatement.resStatement,new Skip()); }
        | 'else' openStatement { $resIf = $openStatement.resStatement; } )
    ;

singleStatement returns [Statement oneStatement]:

    ass=assign { $oneStatement = $ass.assignment; }
    | brk=breakRole { $oneStatement = $brk.resBreak; }
    | cnt=continueRole { $oneStatement = $cnt.resContinue; }
    | dc=dec { $oneStatement = $dc.resDec; }
    | ic=inc { $oneStatement = $ic.resInc; }
    | prt=printRole { $oneStatement = $prt.resPrint; }
    | rtn=returnRole { $oneStatement = $rtn.resReturn; }
    | dcl=declaration { $oneStatement = $dcl.defList; }
    | SEMICOLON { $oneStatement = new Skip(); }
    ;

declaration returns [LocalVarsDefinitions defList]
    @init
    {
        $defList = new LocalVarsDefinitions();
    }:
    VAR def1=assignID { $defList.addVarDefinition($def1.definition); }
    ( COMMA def2=assignID
        {  $defList.addVarDefinition($def2.definition); } )*
    SEMICOLON
    ;

assignID returns [LocalVarDef definition]:
    name=ID EQUAL init=expression
    { $definition = new LocalVarDef(new Identifier($name.text), $init.expr);
     $definition.line=$EQUAL.getLine(); }
    ;

assign returns [Assign assignment]:
    expression1=expression EQUAL expression2=expression SEMICOLON
    { $assignment = new Assign($expression1.expr,$expression2.expr); }
    ;

block returns [Block resBlock]:
    BEGIN
        statement1=statementStar
        {
            $resBlock = new Block();
            for (int i = 0; i<$statement1.statements.size(); i++)
                $resBlock.addStatement($statement1.statements.get(i));
        }
    END
    ;

breakRole returns [Break resBreak]:
    BREAK SEMICOLON
    { $resBreak = new Break(); $resBreak.line=$BREAK.getLine(); }
    ;

continueRole returns [Continue resContinue]:
    CONTINUE SEMICOLON
    { $resContinue = new Continue(); $resContinue.line=$CONTINUE.getLine(); }
    ;

dec returns[DecStatement resDec]:
    expr=expression MINUS MINUS SEMICOLON
    { $resDec = new DecStatement($expr.expr); $resDec.line=$expr.start.getLine();}
    ;

inc returns[IncStatement resInc] :
    expr=expression PLUS PLUS SEMICOLON
    { $resInc = new IncStatement($expr.expr); $resInc.line=$expr.start.getLine(); }
    ;

printRole returns [PrintLine resPrint]:
    PRINT LPAR arg=expression RPAR SEMICOLON
    { $resPrint = new PrintLine($arg.expr); $resPrint.line=$PRINT.getLine(); }
    ;

returnRole returns [Return resReturn]:
    RETURN expr=expression SEMICOLON
    { $resReturn =  new Return($expr.expr); $resReturn.line=$RETURN.getLine(); }
    ;

expression returns[Expression expr ]:
    expressionl1 = expressionL1 { $expr= $expressionl1.expr; $expr.line=$expressionl1.start.getLine(); }
    | expressionl1=expressionL1 OR expressionr=expression
    { $expr = new Or($expressionl1.expr,$expressionr.expr); $expr.line=$expressionl1.start.getLine(); }
    ;

expressionL1 returns[Expression expr ]:
    expressionl2=expressionL2 { $expr=$expressionl2.expr; $expr.line=$expressionl2.start.getLine(); }
    | expressionl2=expressionL2 AND expressionl1=expressionL1
    { $expr = new And($expressionl2.expr,$expressionl1.expr); $expr.line=$expressionl2.start.getLine(); }
    ;

expressionL2 returns[Expression expr ]:
    expressionl3=expressionL3 { $expr=$expressionl3.expr; $expr.line=$expressionl3.start.getLine(); }
    | expressionl3=expressionL3 EQUALS expressionl2=expressionL2
    { $expr = new Equals($expressionl3.expr, $expressionl2.expr); $expr.line=$expressionl3.start.getLine(); }
    | expressionl3=expressionL3 LESSER GREATER expressionl2=expressionL2
    { $expr = new NotEquals($expressionl3.expr, $expressionl2.expr); $expr.line=$expressionl3.start.getLine(); }
    ;

expressionL3 returns [Expression expr]:
    expressionl4=expressionL4 { $expr=$expressionl4.expr; $expr.line=$expressionl4.start.getLine(); }
    |expressionl4=expressionL4 LESSER expressionl3=expressionL3
    { $expr = new LessThan($expressionl4.expr,$expressionl3.expr); $expr.line=$expressionl4.start.getLine(); }
    |expressionl4=expressionL4 GREATER expressionl3=expressionL3
    { $expr = new GreaterThan($expressionl4.expr,$expressionl3.expr); $expr.line=$expressionl4.start.getLine(); }
    ;

expressionL4 returns [Expression expr]:
    expressionl5=expressionL5 { $expr=$expressionl5.expr; $expr.line=$expressionl5.start.getLine(); }
    |expressionl5=expressionL5 PLUS expressionl4=expressionL4
    { $expr = new Plus($expressionl5.expr,$expressionl4.expr); $expr.line=$expressionl5.start.getLine(); }
    |expressionl5=expressionL5 MINUS expressionl4=expressionL4
    { $expr = new Minus($expressionl5.expr,$expressionl4.expr); $expr.line=$expressionl5.start.getLine(); }
    ;

expressionL5 returns [Expression expr]:
    expressionl6=expressionL6 { $expr=$expressionl6.expr; $expr.line=$expressionl6.start.getLine(); }
    |expressionl5=expressionL5 DIVIDE expressionl6=expressionL6
    { $expr = new Division($expressionl5.expr,$expressionl6.expr); $expr.line=$expressionl6.start.getLine(); }
    |expressionl5=expressionL5 MULTY expressionl6=expressionL6
    { $expr = new Times($expressionl5.expr,$expressionl6.expr); $expr.line=$expressionl6.start.getLine(); }
    |expressionl5=expressionL5 MODULO expressionl6=expressionL6
    { $expr = new Modulo($expressionl5.expr,$expressionl6.expr); $expr.line=$expressionl6.start.getLine(); }
    ;

expressionL6 returns [Expression expr]:
    expressionl7=expressionL7 { $expr=$expressionl7.expr; $expr.line=$expressionl7.start.getLine(); }
    | NOT expressionl6=expressionL6
    {$expr= new Not( $expressionl6.expr); $expr.line=$NOT.getLine(); }
    | MINUS expressionl6=expressionL6
    {$expr= new Neg( $expressionl6.expr); $expr.line=$MINUS.getLine();}
    ;

expressionL7 returns [Expression expr]:
    calls=call { $expr = $calls.resExp; $expr.line=$calls.start.getLine(); }
    | fCall=funcCall[new Self()] { $expr = $fCall.resMethod; $expr.line=$fCall.start.getLine(); }
    |LPAR inExpr=expression RPAR { $expr = $inExpr.expr; $expr.line=$inExpr.start.getLine(); }
    | sExp=singleExpression { $expr = $sExp.expr; $expr.line= $sExp.start.getLine(); }
    ;

call returns [Expression resExp]:
    ( name1=ID { $resExp = new Identifier($name1.text); }
    | SELF { $resExp = new Self(); }
    | name2=ID '[' expr = expression ']' { $resExp = new ArrayCall(new Identifier($name2.text),$expr.expr); } )
    ( call2=callItem[$resExp] { $resExp = $call2.resExp; })*
    ;

callItem[Expression prvExp] returns [Expression resExp]:
    callSeq[$prvExp] { $resExp = $callSeq.resExp; }
    ( '[' expression ']' { $resExp = new ArrayCall($resExp, $expression.expr); } | )
    ;

callSeq[Expression prvExp] returns [Expression resExp]
    @init
    {
        $resExp = $prvExp;
    }:
    '.'
    ( name=ID{ $resExp = new FieldCall($prvExp,new Identifier($name.text)); }
    | fCall = funcCall[$resExp] { $resExp = $fCall.resMethod; } )
    ;

funcCall[Expression prvExp] returns [MethodCall resMethod]:
    (name1=ID '(' ')' { $resMethod = new MethodCall($prvExp, new Identifier($name1.text)); }
    | name2=ID '(' { $resMethod = new MethodCall($prvExp, new Identifier($name2.text)); }
    expr1=expression { $resMethod.addArg($expr1.expr); }
    (',' expr2=expression { $resMethod.addArg($expr2.expr); } )* ')' )
    ;

singleExpression returns [Expression expr]:
      name = ID { $expr = new Identifier($name.text); $expr.line=$name.getLine(); }
    | number = NUMBER { $expr = new IntValue($number.int); $expr.line=$number.getLine(); }
    | stringCons = STRINGCONST  { $expr = new StringValue($stringCons.text); $expr.line=$stringCons.getLine(); }
    | bool = BoolValue { $expr = new BoolValue(($bool.text.equals("false")) ? false : true ); $expr.line=$bool.getLine(); }
    | na=newArray { $expr= $na.resArray; $expr.line=$na.start.getLine(); }
    | nci=newClassInstance { $expr = $nci.resCI; $expr.line=$nci.start.getLine(); }
    | slf=SELF { $expr = new Self(); $expr.line= $slf.getLine(); }
//    | arrayC=arrayCall
    ;

newArray returns[NewArray resArray]:
    NEW sType=singleType LBER expr=expression RBER
    { $resArray =  new NewArray($sType.resType,$expr.expr); }
    ;

newClassInstance returns[NewClassInstance resCI]:
    NEW id=ID '(' ')'
    { $resCI=new NewClassInstance(new Identifier($id.text)); }
    ;

//LETTER:
//    [a-z] | [A-Z]
//    ;


STRINGCONST:
    '"' ~["]* '"'
    ;

NUMBER:
    [1-9][0-9]* | [0]
    ;

//CHARACTER:
//    [a-z] | [A-Z] | [-] | [+]
//    ;

WS:
    [ \t\n] -> skip
    ;

Bool: 'bool' ;

BoolValue: 'false' | 'true' ;

RETURN: 'return' ;

RETURNS: 'returns' ;

PRINT: 'print' ;

BREAK: 'break' ;

END: 'end' ;

CONTINUE: 'continue' ;

ENTRY: 'entry';

NEW: 'new' ;

PRIVATE: 'private' ;

PUBLIC: 'public' ;

VAR: 'var' ;

INHERITS: 'inherits' ;

BEGIN: 'begin' ;

INT: 'int' ;

STRING: 'string' ;

CLASS: 'class' ;

FUNCTION: 'function' ;

SELF: 'self' ;

FIELD: 'field' ;

IF: 'if' ;

WHILE: 'while' ;

ELSE: 'else' ;

ELIF: 'elif' ;

COLON: ':' ;

PLUS: '+' ;

MINUS: '-' ;

MULTY: '*' ;

DIVIDE: '/' ;

MODULO: '%' ;

NOT: '!' ;

AND: '&&' ;

OR: '||' ;

EQUAL: '=' ;

EQUALS: '==' ;

GREATER: '>' ;

LESSER: '<' ;

DOT: '.' ;

COMMA: ',' ;

LPAR: '(' ;

RPAR: ')' ;

LBER: '[' ;

RBER: ']' ;

SEMICOLON: ';' ;

SCOMMAND: '//' ;

RCOMMAND: '*/' ;

LCOMMAND: '/*' ;

LINECOMMAND : SCOMMAND (~[\n\r])* -> skip;

COMMAND : LCOMMAND .*? RCOMMAND -> skip;

ID:
    [a-zA-Z][a-zA-Z]*
    ;