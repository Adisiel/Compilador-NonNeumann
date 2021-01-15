/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AIntDecimalNumeralInt extends PNumeralInt
{
    private TIntDecimal _intDecimal_;

    public AIntDecimalNumeralInt()
    {
        // Constructor
    }

    public AIntDecimalNumeralInt(
        @SuppressWarnings("hiding") TIntDecimal _intDecimal_)
    {
        // Constructor
        setIntDecimal(_intDecimal_);

    }

    @Override
    public Object clone()
    {
        return new AIntDecimalNumeralInt(
            cloneNode(this._intDecimal_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntDecimalNumeralInt(this);
    }

    public TIntDecimal getIntDecimal()
    {
        return this._intDecimal_;
    }

    public void setIntDecimal(TIntDecimal node)
    {
        if(this._intDecimal_ != null)
        {
            this._intDecimal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._intDecimal_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._intDecimal_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._intDecimal_ == child)
        {
            this._intDecimal_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._intDecimal_ == oldChild)
        {
            setIntDecimal((TIntDecimal) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
