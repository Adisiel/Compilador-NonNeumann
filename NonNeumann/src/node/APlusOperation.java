/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class APlusOperation extends POperation
{
    private POperation _operation_;
    private TPlus _plus_;
    private PFactor _factor_;

    public APlusOperation()
    {
        // Constructor
    }

    public APlusOperation(
        @SuppressWarnings("hiding") POperation _operation_,
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setOperation(_operation_);

        setPlus(_plus_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new APlusOperation(
            cloneNode(this._operation_),
            cloneNode(this._plus_),
            cloneNode(this._factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusOperation(this);
    }

    public POperation getOperation()
    {
        return this._operation_;
    }

    public void setOperation(POperation node)
    {
        if(this._operation_ != null)
        {
            this._operation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operation_ = node;
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
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
            + toString(this._operation_)
            + toString(this._plus_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operation_ == child)
        {
            this._operation_ = null;
            return;
        }

        if(this._plus_ == child)
        {
            this._plus_ = null;
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
        if(this._operation_ == oldChild)
        {
            setOperation((POperation) newChild);
            return;
        }

        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
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