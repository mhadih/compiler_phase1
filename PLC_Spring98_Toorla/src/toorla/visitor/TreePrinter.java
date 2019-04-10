package toorla.visitor;

import toorla.ast.Program;
import toorla.ast.declaration.classDecs.ClassDeclaration;
import toorla.ast.declaration.classDecs.EntryClassDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.AccessModifier;
import toorla.ast.declaration.classDecs.classMembersDecs.ClassMemberDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.FieldDeclaration;
import toorla.ast.declaration.classDecs.classMembersDecs.MethodDeclaration;
import toorla.ast.declaration.localVarDecs.ParameterDeclaration;
import toorla.ast.expression.*;
import toorla.ast.expression.binaryExpression.*;
import toorla.ast.expression.unaryExpression.Neg;
import toorla.ast.expression.unaryExpression.Not;
import toorla.ast.expression.value.BoolValue;
import toorla.ast.expression.value.IntValue;
import toorla.ast.expression.value.StringValue;
import toorla.ast.statement.*;
import toorla.ast.statement.localVarStats.LocalVarDef;
import toorla.ast.statement.localVarStats.LocalVarsDefinitions;
import toorla.ast.statement.returnStatement.Return;
import toorla.types.Type;
import toorla.types.singleType.SingleType;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class TreePrinter implements Visitor<Void> {
    //TODO : Implement all visit methods in TreePrinter to print AST as required in phase1 document
    @Override
    public Void visit(PrintLine printStat)
    {
        System.out.println("( print ");
        Expression arg = printStat.getArg();
        arg.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Assign assignStat) {
        System.out.println("( = ");
        Expression right = assignStat.getRvalue();
        Expression left = assignStat.getLvalue();
        right.accept(this);
        left.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Block block) {
        System.out.println("( ");
        for(Statement state : block.body)
        {
            state.accept(this);
        }
        System.out.println(" ) ");
        return null;
    }

    @Override
    public Void visit(Conditional conditional)
    {
        System.out.println("( if ");
        Expression condition = conditional.getCondition();
        Statement then = conditional.getThenStatement();
        Statement elze = conditional.getElseStatement();
        condition.accept(this);
        then.accept(this);
//        if(elze != null)
        elze.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(While whileStat)
    {
        System.out.println("( while ");
        whileStat.expr.accept(this);
        whileStat.body.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Return returnStat)
    {
        System.out.println("( return ");
        Expression expr = returnStat.getReturnedExpr();
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Break breakStat)
    {
        System.out.println(breakStat.toString());
        return null;
    }

    @Override
    public Void visit(Continue continueStat)
    {
        System.out.println(continueStat.toString());
        return null;
    }

    @Override
    public Void visit(Skip skip)
    {
        System.out.println(skip.toString());
        return null;
    }

    @Override
    public Void visit(LocalVarDef localVarDef)
    {
        System.out.println("( var");
        Identifier id = localVarDef.getLocalVarName();
        Expression expr =  localVarDef.getInitialValue();
        id.accept(this);
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(IncStatement incStatement)
    {
        System.out.println("( ++");
        Expression expr = incStatement.getOperand();
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(DecStatement decStatement)
    {
        System.out.println("(-- ");
        Expression expr = decStatement.getOperand();
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Plus plusExpr)
    {
        System.out.println("( +");
        Expression right = plusExpr.getRhs();
        Expression left = plusExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Minus minusExpr)
    {
        System.out.println("( -");
        Expression right = minusExpr.getRhs();
        Expression left = minusExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Times timesExpr)
    {
        System.out.println("( *");
        Expression right = timesExpr.getRhs();
        Expression left = timesExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Division divExpr)
    {
        System.out.println("( /");
        Expression right = divExpr.getRhs();
        Expression left = divExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Modulo moduloExpr)
    {
        System.out.println("( %");
        Expression right = moduloExpr.getRhs();
        Expression left = moduloExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Equals equalsExpr)
    {
        System.out.println("( ==");
        Expression right = equalsExpr.getRhs();
        Expression left = equalsExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(GreaterThan gtExpr)
    {
        System.out.println("( >");
        Expression right = gtExpr.getRhs();
        Expression left = gtExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(LessThan lessThanExpr)
    {
        System.out.println("( <");
        Expression right = lessThanExpr.getRhs();
        Expression left = lessThanExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(And andExpr)
    {
        System.out.println("( &&");
        Expression right = andExpr.getRhs();
        Expression left = andExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Or orExpr)
    {
        System.out.println("( ||");
        Expression right = orExpr.getRhs();
        Expression left = orExpr.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(NotEquals notEquals)
    {
        System.out.println("( <>");
        Expression right = notEquals.getRhs();
        Expression left = notEquals.getLhs();
        left.accept(this);
        right.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Neg negExpr)
    {
        System.out.println("( -");
        Expression expr = negExpr.getExpr();
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Not notExpr)
    {
        System.out.println("( !");
        Expression expr = notExpr.getExpr();
        expr.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println(identifier.toString());
        return null;
    }

    @Override
    public Void visit(Self self) {
        System.out.println(self.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue)
    {
        System.out.println(intValue.toString());
        return null;
    }

    @Override
    public Void visit(NewArray newArray)
    {
        System.out.println("( new arrayof ");
        Expression expr = newArray.getLength();
        SingleType singletype = newArray.getType();
        System.out.println(singletype.toString());
        expr.accept(this);
        return null;
    }

    @Override
    public Void visit(BoolValue booleanValue)
    {
        System.out.println(booleanValue.toString());

        return null;
    }

    @Override
    public Void visit(StringValue stringValue)
    {
        System.out.println(stringValue.toString());
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance)
    {
        System.out.println("(  new ");
        Identifier id = newClassInstance.getClassName();
        id.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(FieldCall fieldCall)
    {
        System.out.println("field call : ( . ");
        Expression expr = fieldCall.getInstance();
        Identifier id = fieldCall.getField();
        expr.accept(this);
        id.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall)
    {
        System.out.println("method call : ( . ");
        Expression expr = methodCall.getInstance();
        Identifier id = methodCall.getMethodName();
        ArrayList <Expression> args = methodCall.getArgs();
        expr.accept(this);
        id.accept(this);
        System.out.println("(");
        for(int i=0; i< args.size();i++)
        {
            args.get(i).accept(this);
        }
        System.out.println(")");
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(ArrayCall arrayCall)
    {
        System.out.println("( [] ");
        Expression instance = arrayCall.getInstance();
        Expression index = arrayCall.getIndex();
        instance.accept(this);
        index.accept(this);
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println("( class ");
        Identifier name = classDeclaration.getName();
        Identifier parentName = classDeclaration.getParentName();
        ArrayList <ClassMemberDeclaration> member = classDeclaration.getClassMembers();
        name.accept(this);
        if (parentName != null)
            parentName.accept(this);
        for (int i=0; i < member.size();i++)
        {
            member.get(i).accept(this);
        }
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(EntryClassDeclaration entryClassDeclaration)
    {
        System.out.println("( entry  class ");
        Identifier name = entryClassDeclaration.getName();
        Identifier parentName = entryClassDeclaration.getParentName();
        ArrayList <ClassMemberDeclaration> member = entryClassDeclaration.getClassMembers();
        name.accept(this);
        if(parentName != null) {
            parentName.accept(this);
        }
        for (int i=0; i < member.size();i++)
        {
            member.get(i).accept(this);
        }
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration)
    {
        System.out.println("( ");
        AccessModifier accessModifier = fieldDeclaration.getAccessModifier();
        System.out.println(accessModifier.toString());
        System.out.println(" field ");
        Identifier id = fieldDeclaration.getIdentifier();
        Type type = fieldDeclaration.getType();
        id.accept(this);
        System.out.println(type.toString());
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration)
    {
        System.out.println("( ");
        Identifier id = parameterDeclaration.getIdentifier();
        Type type = parameterDeclaration.getType();
        id.accept(this);
        System.out.println(" : ");
        System.out.println(type.toString());
        System.out.println(" )");
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration)
    {
        System.out.println("( ");
        Type returntype = methodDeclaration.getReturnType();
        Identifier name = methodDeclaration.getName();
        AccessModifier accessModifier = methodDeclaration.getAccessModifier();
        ArrayList <ParameterDeclaration> args = methodDeclaration.getArgs();
        ArrayList <Statement> body = methodDeclaration.getBody();
        System.out.println(accessModifier.toString());
        System.out.println("( method ");
        name.accept(this);
        for (int i = 0; i < args.size(); i++)
            System.out.println( args.get(i).accept(this) );

        if(returntype != null)
        {
        System.out.println(returntype.toString());
        }
        System.out.println("( ");
        if(body.size() != 0)
            for (int i = 0; i < body.size(); i++)
                body.get(i).accept(this);
        System.out.println(" )");
        System.out.println(" )");
        return null;

//        Type returntype = methodDeclaration.getReturnType();
//        Identifier name = methodDeclaration.getName();
//        AccessModifier accessModifier = methodDeclaration.getAccessModifier();
//        ArrayList <ParameterDeclaration> args = methodDeclaration.getArgs();
//        ArrayList <Statement> body = methodDeclaration.getBody();
//        System.out.println("( " + accessModifier.toString() + " method " + name.accept(this));
//        for (int i = 0; i < args.size(); i++)
//            System.out.println("/t( "+ args.get(i).accept(this) + " )");
//        System.out.println(returntype.toString());
//        System.out.println("/t( ");
//        for (int i = 0; i < body.size(); i++)
//            System.out.println("/t" + body.get(i).accept(this));
//        System.out.println("/t )");
//        System.out.println(" )");
//        return null;

    }

    @Override
    public Void visit(LocalVarsDefinitions localVarsDefinitions)
    {
//        System.out.println("(");
        List<LocalVarDef> defs = localVarsDefinitions.getVarDefinitions();
        for(int i = 0 ;i < defs.size() ; i++)
            defs.get(i).accept(this);
//        System.out.println(" )");


        return null;
    }

    @Override
    public Void visit(Program program) {
        System.out.println("( ");
        List <ClassDeclaration> classdeclaration = program.getClasses();
        for (int i = 0; i < classdeclaration.size(); i++)
            classdeclaration.get(i).accept(this);
        System.out.println(") ");
        return null;
    }
}
