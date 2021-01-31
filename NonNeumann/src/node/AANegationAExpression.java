/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AANegationAExpression extends PAExpression
{
    private PAExpression _right_;

    public AANegationAExpression()
    {
        // Constructor
    }

    public AANegationAExpression(
        @SuppressWarnings("hiding") PAExpression _right_)
    {
        // Constructor
        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AANegationAExpression(
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAANegationAExpression(this);
    }

    public PAExpression getRight()
    {
        return this._right_;
    }

    public void setRight(PAExpression node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._right_ == oldChild)
        {
            setRight((PAExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
