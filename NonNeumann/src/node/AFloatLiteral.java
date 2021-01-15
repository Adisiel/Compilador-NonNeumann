/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFloatLiteral extends PLiteral
{
    private PNumeralFloat _numeralFloat_;

    public AFloatLiteral()
    {
        // Constructor
    }

    public AFloatLiteral(
        @SuppressWarnings("hiding") PNumeralFloat _numeralFloat_)
    {
        // Constructor
        setNumeralFloat(_numeralFloat_);

    }

    @Override
    public Object clone()
    {
        return new AFloatLiteral(
            cloneNode(this._numeralFloat_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatLiteral(this);
    }

    public PNumeralFloat getNumeralFloat()
    {
        return this._numeralFloat_;
    }

    public void setNumeralFloat(PNumeralFloat node)
    {
        if(this._numeralFloat_ != null)
        {
            this._numeralFloat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeralFloat_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeralFloat_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeralFloat_ == child)
        {
            this._numeralFloat_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeralFloat_ == oldChild)
        {
            setNumeralFloat((PNumeralFloat) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}