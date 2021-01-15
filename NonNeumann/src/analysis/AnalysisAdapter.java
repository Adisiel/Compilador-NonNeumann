/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseADecFunction(ADecFunction node)
    {
        defaultCase(node);
    }

    public void caseAFunctionParamAuxiliar(AFunctionParamAuxiliar node)
    {
        defaultCase(node);
    }

    public void caseAFunctionExpressionAuxiliar(AFunctionExpressionAuxiliar node)
    {
        defaultCase(node);
    }

    public void caseAIntType(AIntType node)
    {
        defaultCase(node);
    }

    public void caseARealType(ARealType node)
    {
        defaultCase(node);
    }

    public void caseABoolType(ABoolType node)
    {
        defaultCase(node);
    }

    public void caseAParameters(AParameters node)
    {
        defaultCase(node);
    }

    public void caseAParametersAuxiliar(AParametersAuxiliar node)
    {
        defaultCase(node);
    }

    public void caseADecParameter(ADecParameter node)
    {
        defaultCase(node);
    }

    public void caseAAssignParameter(AAssignParameter node)
    {
        defaultCase(node);
    }

    public void caseAAssign(AAssign node)
    {
        defaultCase(node);
    }

    public void caseAParametersAssign(AParametersAssign node)
    {
        defaultCase(node);
    }

    public void caseAParametersAssignAux(AParametersAssignAux node)
    {
        defaultCase(node);
    }

    public void caseATypeParameterAssign(ATypeParameterAssign node)
    {
        defaultCase(node);
    }

    public void caseAAssignParameterAssign(AAssignParameterAssign node)
    {
        defaultCase(node);
    }

    public void caseAOpExpression(AOpExpression node)
    {
        defaultCase(node);
    }

    public void caseAGtExpression(AGtExpression node)
    {
        defaultCase(node);
    }

    public void caseALtExpression(ALtExpression node)
    {
        defaultCase(node);
    }

    public void caseAEqualExpression(AEqualExpression node)
    {
        defaultCase(node);
    }

    public void caseANegBoolExpression(ANegBoolExpression node)
    {
        defaultCase(node);
    }

    public void caseAOrExpression(AOrExpression node)
    {
        defaultCase(node);
    }

    public void caseAAndExpression(AAndExpression node)
    {
        defaultCase(node);
    }

    public void caseAIfStatementExpression(AIfStatementExpression node)
    {
        defaultCase(node);
    }

    public void caseALambdaExpression(ALambdaExpression node)
    {
        defaultCase(node);
    }

    public void caseAFactorOp(AFactorOp node)
    {
        defaultCase(node);
    }

    public void caseAPlusOp(APlusOp node)
    {
        defaultCase(node);
    }

    public void caseAMinusOp(AMinusOp node)
    {
        defaultCase(node);
    }

    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    public void caseAMultFactor(AMultFactor node)
    {
        defaultCase(node);
    }

    public void caseADivFactor(ADivFactor node)
    {
        defaultCase(node);
    }

    public void caseANegFactor(ANegFactor node)
    {
        defaultCase(node);
    }

    public void caseAModFactor(AModFactor node)
    {
        defaultCase(node);
    }

    public void caseALiteralTerm(ALiteralTerm node)
    {
        defaultCase(node);
    }

    public void caseAExpressionTerm(AExpressionTerm node)
    {
        defaultCase(node);
    }

    public void caseACallFunctionTerm(ACallFunctionTerm node)
    {
        defaultCase(node);
    }

    public void caseANegation(ANegation node)
    {
        defaultCase(node);
    }

    public void caseABooleanLiteral(ABooleanLiteral node)
    {
        defaultCase(node);
    }

    public void caseAFloatLiteral(AFloatLiteral node)
    {
        defaultCase(node);
    }

    public void caseAIntLiteral(AIntLiteral node)
    {
        defaultCase(node);
    }

    public void caseATrueBooleanValue(ATrueBooleanValue node)
    {
        defaultCase(node);
    }

    public void caseAFalseBooleanValue(AFalseBooleanValue node)
    {
        defaultCase(node);
    }

    public void caseAFloatNumeralFloat(AFloatNumeralFloat node)
    {
        defaultCase(node);
    }

    public void caseACientificNotationNumeralFloat(ACientificNotationNumeralFloat node)
    {
        defaultCase(node);
    }

    public void caseAIntDecimalNumeralInt(AIntDecimalNumeralInt node)
    {
        defaultCase(node);
    }

    public void caseAIntHexadecimalNumeralInt(AIntHexadecimalNumeralInt node)
    {
        defaultCase(node);
    }

    public void caseACallFunctionCallFunction(ACallFunctionCallFunction node)
    {
        defaultCase(node);
    }

    public void caseAListExpressionsListExpressions(AListExpressionsListExpressions node)
    {
        defaultCase(node);
    }

    public void caseAListExpressionsAuxListExpressionsAux(AListExpressionsAuxListExpressionsAux node)
    {
        defaultCase(node);
    }

    public void caseADeclarationConstantDeclarationConstant(ADeclarationConstantDeclarationConstant node)
    {
        defaultCase(node);
    }

    public void caseALambda(ALambda node)
    {
        defaultCase(node);
    }

    public void caseALambdaListExpressions(ALambdaListExpressions node)
    {
        defaultCase(node);
    }

    public void caseALambdaListExpressionsAuxiliar(ALambdaListExpressionsAuxiliar node)
    {
        defaultCase(node);
    }

    public void caseAListIdentifiers(AListIdentifiers node)
    {
        defaultCase(node);
    }

    public void caseAListIdentifiersAux(AListIdentifiersAux node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAIfStatementExpAux(AIfStatementExpAux node)
    {
        defaultCase(node);
    }

    public void caseAIfStatementElseAux(AIfStatementElseAux node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTConstant(TConstant node)
    {
        defaultCase(node);
    }

    public void caseTFunction(TFunction node)
    {
        defaultCase(node);
    }

    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTThen(TThen node)
    {
        defaultCase(node);
    }

    public void caseTTkLambda(TTkLambda node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTEntry(TEntry node)
    {
        defaultCase(node);
    }

    public void caseTLeftParentheses(TLeftParentheses node)
    {
        defaultCase(node);
    }

    public void caseTRightParentheses(TRightParentheses node)
    {
        defaultCase(node);
    }

    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTDivide(TDivide node)
    {
        defaultCase(node);
    }

    public void caseTProduct(TProduct node)
    {
        defaultCase(node);
    }

    public void caseTModule(TModule node)
    {
        defaultCase(node);
    }

    public void caseTExclamation(TExclamation node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTMinor(TMinor node)
    {
        defaultCase(node);
    }

    public void caseTBigger(TBigger node)
    {
        defaultCase(node);
    }

    public void caseTLeftBracket(TLeftBracket node)
    {
        defaultCase(node);
    }

    public void caseTRightBracket(TRightBracket node)
    {
        defaultCase(node);
    }

    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    public void caseTPower(TPower node)
    {
        defaultCase(node);
    }

    public void caseTIntHexadecimal(TIntHexadecimal node)
    {
        defaultCase(node);
    }

    public void caseTIntDecimal(TIntDecimal node)
    {
        defaultCase(node);
    }

    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    public void caseTCientificNotation(TCientificNotation node)
    {
        defaultCase(node);
    }

    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTBlockComment(TBlockComment node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
