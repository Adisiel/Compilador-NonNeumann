/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AParametersAssignSequence extends PParametersAssignSequence
{
    private TComma _comma_;
    private PParameterAssign _parameterAssign_;

    public AParametersAssignSequence()
    {
        // Constructor
    }

    public AParametersAssignSequence(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PParameterAssign _parameterAssign_)
    {
        // Constructor
        setComma(_comma_);

        setParameterAssign(_parameterAssign_);

    }

    @Override
    public Object clone()
    {
        return new AParametersAssignSequence(
            cloneNode(this._comma_),
            cloneNode(this._parameterAssign_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametersAssignSequence(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PParameterAssign getParameterAssign()
    {
        return this._parameterAssign_;
    }

    public void setParameterAssign(PParameterAssign node)
    {
        if(this._parameterAssign_ != null)
        {
            this._parameterAssign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterAssign_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._parameterAssign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._parameterAssign_ == child)
        {
            this._parameterAssign_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._parameterAssign_ == oldChild)
        {
            setParameterAssign((PParameterAssign) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}