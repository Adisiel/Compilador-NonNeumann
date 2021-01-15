/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAssignParameter extends PParameter
{
    private PAssign _assign_;

    public AAssignParameter()
    {
        // Constructor
    }

    public AAssignParameter(
        @SuppressWarnings("hiding") PAssign _assign_)
    {
        // Constructor
        setAssign(_assign_);

    }

    @Override
    public Object clone()
    {
        return new AAssignParameter(
            cloneNode(this._assign_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignParameter(this);
    }

    public PAssign getAssign()
    {
        return this._assign_;
    }

    public void setAssign(PAssign node)
    {
        if(this._assign_ != null)
        {
            this._assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assign_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._assign_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._assign_ == child)
        {
            this._assign_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._assign_ == oldChild)
        {
            setAssign((PAssign) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
