/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AMinusOp extends POp
{
    private POp _op_;
    private TMinus _minus_;
    private PFactor _factor_;

    public AMinusOp()
    {
        // Constructor
    }

    public AMinusOp(
        @SuppressWarnings("hiding") POp _op_,
        @SuppressWarnings("hiding") TMinus _minus_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setOp(_op_);

        setMinus(_minus_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new AMinusOp(
            cloneNode(this._op_),
            cloneNode(this._minus_),
            cloneNode(this._factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusOp(this);
    }

    public POp getOp()
    {
        return this._op_;
    }

    public void setOp(POp node)
    {
        if(this._op_ != null)
        {
            this._op_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._op_ = node;
    }

    public TMinus getMinus()
    {
        return this._minus_;
    }

    public void setMinus(TMinus node)
    {
        if(this._minus_ != null)
        {
            this._minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minus_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._op_)
            + toString(this._minus_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._op_ == child)
        {
            this._op_ = null;
            return;
        }

        if(this._minus_ == child)
        {
            this._minus_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._op_ == oldChild)
        {
            setOp((POp) newChild);
            return;
        }

        if(this._minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}