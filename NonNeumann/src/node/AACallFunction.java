/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AACallFunction extends PACallFunction
{
    private TIdentifier _identifier_;
    private PAListExpressions _aListExpressions_;

    public AACallFunction()
    {
        // Constructor
    }

    public AACallFunction(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PAListExpressions _aListExpressions_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setAListExpressions(_aListExpressions_);

    }

    @Override
    public Object clone()
    {
        return new AACallFunction(
            cloneNode(this._identifier_),
            cloneNode(this._aListExpressions_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAACallFunction(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
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
            + toString(this._identifier_)
            + toString(this._aListExpressions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
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
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
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
