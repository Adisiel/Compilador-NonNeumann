/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AALambda extends PALambda
{
    private PAListIdentifiers _aListIdentifiers_;
    private PAExpression _aExpression_;
    private PAListExpressions _aListExpressions_;

    public AALambda()
    {
        // Constructor
    }

    public AALambda(
        @SuppressWarnings("hiding") PAListIdentifiers _aListIdentifiers_,
        @SuppressWarnings("hiding") PAExpression _aExpression_,
        @SuppressWarnings("hiding") PAListExpressions _aListExpressions_)
    {
        // Constructor
        setAListIdentifiers(_aListIdentifiers_);

        setAExpression(_aExpression_);

        setAListExpressions(_aListExpressions_);

    }

    @Override
    public Object clone()
    {
        return new AALambda(
            cloneNode(this._aListIdentifiers_),
            cloneNode(this._aExpression_),
            cloneNode(this._aListExpressions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAALambda(this);
    }

    public PAListIdentifiers getAListIdentifiers()
    {
        return this._aListIdentifiers_;
    }

    public void setAListIdentifiers(PAListIdentifiers node)
    {
        if(this._aListIdentifiers_ != null)
        {
            this._aListIdentifiers_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aListIdentifiers_ = node;
    }

    public PAExpression getAExpression()
    {
        return this._aExpression_;
    }

    public void setAExpression(PAExpression node)
    {
        if(this._aExpression_ != null)
        {
            this._aExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aExpression_ = node;
    }

    public PAListExpressions getAListExpressions()
    {
        return this._aListExpressions_;
    }

    public void setAListExpressions(PAListExpressions node)
    {
        if(this._aListExpressions_ != null)
        {
            this._aListExpressions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aListExpressions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aListIdentifiers_)
            + toString(this._aExpression_)
            + toString(this._aListExpressions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aListIdentifiers_ == child)
        {
            this._aListIdentifiers_ = null;
            return;
        }

        if(this._aExpression_ == child)
        {
            this._aExpression_ = null;
            return;
        }

        if(this._aListExpressions_ == child)
        {
            this._aListExpressions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aListIdentifiers_ == oldChild)
        {
            setAListIdentifiers((PAListIdentifiers) newChild);
            return;
        }

        if(this._aExpression_ == oldChild)
        {
            setAExpression((PAExpression) newChild);
            return;
        }

        if(this._aListExpressions_ == oldChild)
        {
            setAListExpressions((PAListExpressions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
