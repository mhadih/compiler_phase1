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
        $resProgram = new Program();
        for (int i = 0; i<$tmpList.size(); i++)
            $resProgram.addClass($tmpList.get(i));
        $resProgram.line=$list1.start.getLine();
    }
    ;

classStar returns [ArrayList<ClassDeclaration> classList]:
    newClass=classRole
    list=classStar
    {
        $classList = $list.classList;
        $classList.add($newClass.resClass);
        $classList.line=$list.start.getLine();
    }
    |
    //lamda
    { $classList = new ArrayList<>(); }
    ;

classRole returns [ClassDeclaration resClass]:                                                              //////need work
    (CLASS name=ID COLON { $resClass = new ClassDeclaration( new Identifier($name.text) ); $resClass.line=$CLASS.getLine(); }
    | CLASS name=ID INHERITS parent=ID COLON { $resClass = new ClassDeclaration( new Identifier($name.text), new Identifier($parent.text) );
        $resClass.line=$CLASS.getLine();} )
//        body=classItemStar
//        {
//            $resClass.members = $body.members;
//        }
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
//        list1=classItemStar
//        main=mainFunc
//        list2=classItemStar
//        {
//            $resClass.members = $list1.members;
//            $resClass.members.add($main.main);
//            $resClass.members.addAll($list2.members);
//        }
//       }
         (
            variables=field { $resClass.addFieldsDeclarations($variables.resField); $resClass.line=$variables.start.getLine(); }
            |
            func=method { $resClass.addMethodDeclaration($func.resMethod); $resClass.line=$func.start.getLine(); }
            |
            main=mainFunc { System.out.println($main.main); $resClass.addMethodDeclaration($main.main); System.out.println("333");
             $resClass.line=$main.start.getLine();}
         )*
     END
     ;

mainFunc returns [MethodDeclaration main]:                           /////need work
    (PUBLIC)? FUNCTION MAIN LPAR RPAR RETURNS INT COLON
        body=funcBody
    {
        System.out.println("111");
        $main = new MethodDeclaration(new Identifier("main"));
        for (int i = 0; i<$body.statements.size(); i++)
            $main.addStatement((Statement)$body.statements.get(i));
        System.out.println("222");
        $main.line=$FUNCTION.getLine();
    }
    END
    ;

//classItemStar returns [ArrayList<ClassMemberDeclaration> members]:
//    variables=field list=classItemStar { $members = $list.members; $members.addAll(variables.resField); }
//    |
//    func=method list=classItemStar { $members = $list.members; $members.add(func.resMethod); }
//    |
//    //lamda
//    { $members = new ArrayList<>(); }
//    ;

method returns [MethodDeclaration resMethod]:
    (access=access_modifier FUNCTION name=ID { $resMethod = new MethodDeclaration(new Identifier($name.text)); $resMethod.setAccessModifier($access.access);
     $resMethod.line=$ID.getLine(); }
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

argumentList returns [ArrayList<ParameterDeclaration> args]:
    arg=argument list=argumentStar
    {
        $args = $list.argList;
        $args.add($arg.arg);
        $args.line=$arg.start.getLine();
    }
    |
    //lamda//for empty argument list
    { $args = new ArrayList<>(); }
    ;

argumentStar returns [ArrayList<ParameterDeclaration> argList]:
    COMMA arg=argument args=argumentStar
    {
        $argList = $args.argList;
        $argList.add($arg.arg);
        $argList.line=$COMMA.getLine();
    }
    |
    //lamda
    {
        $argList = new ArrayList<>();
    }
    ;

argument returns [ParameterDeclaration arg]:
    name=ID COLON resType=type
    {
        $arg = new ParameterDeclaration(new Identifier($name.text), $resType.resType);
        $arg.line=$ID.getLine();
    }
    ;

field returns [List<FieldDeclaration> resField]:
    access=access_modifier FIELD vars=idPlus resType=type SEMICOLON
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType,$access.access));
        $resField.line=$FIELD.getLine();
    }
    | FIELD vars=idPlus resType=type SEMICOLON
    {
        $resField = new ArrayList<>();
        for (int i = 0; i<$vars.identifiers.size(); i++)
            $resField.add(new FieldDeclaration($vars.identifiers.get(i),$resType.resType));
        $resField.line=$FIELD.getLine();
    }
    ;

access_modifier returns [AccessModifier access]:
    PUBLIC { $access = AccessModifier.ACCESS_MODIFIER_PUBLIC; $access.line=$PUBLIC.getLine();  }
    | PRIVATE { $access = AccessModifier.ACCESS_MODIFIER_PRIVATE; $access.line=$PRIVATE.getLine();  }
    ;

idPlus returns [ArrayList<Identifier> identifiers]:
    name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(new Identifier($name.text));
    $identifiers.line=$ID.getLine(); }
    ;

idStar returns [ArrayList<Identifier> identifiers]:
    COMMA name=ID list=idStar { $identifiers = $list.identifiers; $identifiers.add(new Identifier($name.text));
     $identifiers.line=$ID.getLine(); } ////////////no line
    |
    //lamda
    { $identifiers = new ArrayList<>(); }
    ;

primitiveType returns [SingleType resType]:
    INT { $resType = new IntType(); }
    | STRING     { $resType = new StringType(); }
    | Bool{ $resType = new BoolType(); $resType.line=$Bool.getLine();  }
    ;

singleType returns [SingleType resType]:
    prmType=primitiveType { $resType = $prmType.resType; }
    | className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text)) );
     $resType.line=$ID.getLine();  }
    ;

nonPrimitiveType returns [Type resType]:
    className=ID { $resType = new UserDefinedType( new ClassDeclaration( new Identifier($className.text)));
       $resType.line=$ID.getLine(); }
    | userDefined=singleType { $resType = new ArrayType($userDefined.resType); $resType.line=$userDefined.start.getLine(); }
    ;

type returns [Type resType]:
    prmType=primitiveType { $resType = $prmType.resType; $resType.line=$prmType.start.getLine(); }
    | nnprmType=nonPrimitiveType { $resType = $nnprmType.resType; $resType.line=$nnprmType.start.getLine(); }
    ;

funcBody returns [ArrayList<Statement> statements] locals [Statement tmpStatement]:
     statement1 = statementStar
    {
        $statements = $statement1.statements;
        System.out.println($statements);
        $statements.line=$statement1.start.getLine();
    }
    ;

statementStar returns [ArrayList<Statement> statements]
    @init{
        $statements= new ArrayList<>();
    }
    :
    (statement1=statement)*
    {
        $statements.add($statement1.resStatement);
        $statements.line=$statement1.start.getLine();
    }
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

ifClose returns [Conditional resIf]:
    IF LPAR expr=expression RPAR then=closedStatement ELSE elze=closedStatement
    { $resIf = new Conditional($expr.expr,$then.resStatement,$elze.resStatement); $resIf.line=$IF.getLine(); }
    ;

ifOpen returns [Conditional resIf]:
    IF LPAR expr1=expression RPAR then1=openStatement
    { $resIf = new Conditional($expr1.expr,$then1.resStatement,new Skip()); $resIf.line=$IF.getLine(); }
    | IF LPAR expr2=expression RPAR then2=closedStatement ELSE elze=openStatement
    { $resIf = new Conditional($expr2.expr,$then2.resStatement,$elze.resStatement); $resIf.line=$IF.getLine(); }
    | IF LPAR expr3=expression RPAR then3=singleStatement
    { $resIf = new Conditional($expr3.expr,$then3.oneStatement); $resIf.line=$IF.getLine();  }
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

declaration returns [LocalVarsDefinitions defList]:
    VAR def=assignID list=assignListStar SEMICOLON
    {
        $defList = $list.defList;
        $defList.addVarDefinition($def.definition);
        $defList.line=$VAR.getLine();
    }
    ;

assignListStar returns [LocalVarsDefinitions defList]:
    COMMA def=assignID list=assignListStar
     {
        $defList = $list.defList;
        $defList.addVarDefinition($def.definition);
        $defList.line=$COMMA.getLine();
     }
     |
     //lamda
     { $defList = new LocalVarsDefinitions(); }
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
            $resBlock.line=$statement1.start.getLine();
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
    |expressionl6=expressionL6 DIVIDE expressionl5=expressionL5
    { $expr = new Division($expressionl6.expr,$expressionl5.expr); $expr.line=$expressionl6.start.getLine(); }
    |expressionl6=expressionL6 MULTY expressionl5=expressionL5
    { $expr = new Times($expressionl6.expr,$expressionl5.expr); $expr.line=$expressionl6.start.getLine(); }
    |expressionl6=expressionL6 MODULO expressionl5=expressionL5
    { $expr = new Modulo($expressionl6.expr,$expressionl5.expr); $expr.line=$expressionl6.start.getLine(); }
    ;

expressionL6 returns [Expression expr]:
    expressionl7=expressionL7 { $expr=$expressionl7.expr; $expr.line=$expressionl7.start.getLine(); }
    | NOT expressionl6=expressionL6
    {$expr= new Not( $expressionl6.expr); $expr.line=$NOT.getLine(); }
    | MINUS expressionl6=expressionL6
    {$expr= new Neg( $expressionl6.expr); $expr.line=$MINUS.getLine();}
    ;

expressionL7 returns [Expression expr]:
    sExpr=singleExpression { $expr = $sExpr.expr; $expr.line=$sExpr.start.getLine(); }
    |LPAR inExpr=expression RPAR { $expr = $inExpr.expr; $expr.line=$inExpr.start.getLine(); }
    ;


singleExpression returns [Expression expr]:
      name = ID { $expr = new Identifier($name.text); $expr.line=$name.getLine();}
    | number = NUMBER { $expr = new IntValue($number.int); $expr.line=$number.getLine();}
    | stringCons = STRINGCONST  { $expr = new StringValue($stringCons.text); $expr.line=$stringCons.getLine(); }
    | bool = BoolValue { $expr = new BoolValue(($bool.text == "false") ? false : true ); $expr.line=$bool.getLine();}
    | na=newArray { $expr= $na.resArray; $expr.line=$na.start.getLine();}                 ////////////dout
    | nci=newClassInstance { $expr = $nci.resCI; $expr.line=$nci.start.getLine();}
//    | arrayC=arrayCall
    ;

newArray returns[NewArray resArray]:
    NEW sType=singleType LBER expr=expression RBER
    { $resArray =  new NewArray($sType.resType,$expr.expr);    }
    ;

newClassInstance returns[NewClassInstance resCI]:
    NEW id=ID LBER RBER
    { $resCI=new NewClassInstance(new Identifier($id.text)); }
    ;

//
//arrayCall returns[ArrayCall resAC]:
//        instance=expression LBER index=expression RBER
//    {$}


MAIN:
    'main'
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

ID:
    [a-zA-Z][a-zA-Z]*
    ;