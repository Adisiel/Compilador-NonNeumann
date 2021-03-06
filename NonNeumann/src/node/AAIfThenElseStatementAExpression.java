/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAIfThenElseStatementAExpression extends PAExpression
{
    private PAExpression _cond_;
    private PAExpression _trueCond_;
    private PAExpression _falseCond_;

    public AAIfThenElseStatementAExpression()
    {
        // Constructor
    }

    public AAIfThenElseStatementAExpression(
        @SuppressWarnings("hiding") PAExpression _cond_,
        @SuppressWarnings("hiding") PAExpression _trueCond_,
        @SuppressWarnings("hiding") PAExpression _falseCond_)
    {
        // Constructor
        setCond(_cond_);

        setTrueCond(_trueCond_);

        setFalseCond(_falseCond_);

    }

    @Override
    public Object clone()
    {
        return new AAIfThenElseStatementAExpression(
            cloneNode(this._cond_),
            cloneNode(this._trueCond_),
            cloneNode(this._falseCond_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAIfThenElseStatementAExpression(this);
    }

    public PAExpression getCond()
    {
        return this._cond_;
    }

    public void setCond(PAExpression node)
    {
        if(this._cond_ != null)
        {
            this._cond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cond_ = node;
    }

    public PAExpression getTrueCond()
    {
        return this._trueCond_;
    }

    public void setTrueCond(PAExpression node)
    {
        if(this._trueCond_ != null)
        {
            this._trueCond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._trueCond_ = node;
    }

    public PAExpression getFalseCond()
    {
        return this._falseCond_;
    }

    public void setFalseCond(PAExpression node)
    {
        if(this._falseCond_ != null)
        {
            this._falseCond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._falseCond_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cond_)
            + toString(this._trueCond_)
            + toString(this._falseCond_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cond_ == child)
        {
            this._cond_ = null;
            return;
        }

        if(this._trueCond_ == child)
        {
            this._trueCond_ = null;
            return;
        }

        if(this._falseCond_ == child)
        {
            this._falseCond_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cond_ == oldChild)
        {
            setCond((PAExpression) newChild);
            return;
        }

        if(this._trueCond_ == oldChild)
        {
            setTrueCond((PAExpression) newChild);
            return;
        }

        if(this._falseCond_ == oldChild)
        {
            setFalseCond((PAExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
