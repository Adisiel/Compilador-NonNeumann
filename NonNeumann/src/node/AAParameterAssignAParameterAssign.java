/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAParameterAssignAParameterAssign extends PAParameterAssign
{
    private PAType _aType_;

    public AAParameterAssignAParameterAssign()
    {
        // Constructor
    }

    public AAParameterAssignAParameterAssign(
        @SuppressWarnings("hiding") PAType _aType_)
    {
        // Constructor
        setAType(_aType_);

    }

    @Override
    public Object clone()
    {
        return new AAParameterAssignAParameterAssign(
            cloneNode(this._aType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParameterAssignAParameterAssign(this);
    }

    public PAType getAType()
    {
        return this._aType_;
    }

    public void setAType(PAType node)
    {
        if(this._aType_ != null)
        {
            this._aType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aType_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._aType_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aType_ == child)
        {
            this._aType_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._aType_ == oldChild)
        {
            setAType((PAType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
