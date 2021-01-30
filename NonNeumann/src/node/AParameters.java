/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AParameters extends PParameters
{
    private PParameter _parameter_;
    private final LinkedList<PParametersSequence> _parametersSequence_ = new LinkedList<PParametersSequence>();

    public AParameters()
    {
        // Constructor
    }

    public AParameters(
        @SuppressWarnings("hiding") PParameter _parameter_,
        @SuppressWarnings("hiding") List<PParametersSequence> _parametersSequence_)
    {
        // Constructor
        setParameter(_parameter_);

        setParametersSequence(_parametersSequence_);

    }

    @Override
    public Object clone()
    {
        return new AParameters(
            cloneNode(this._parameter_),
            cloneList(this._parametersSequence_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParameters(this);
    }

    public PParameter getParameter()
    {
        return this._parameter_;
    }

    public void setParameter(PParameter node)
    {
        if(this._parameter_ != null)
        {
            this._parameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameter_ = node;
    }

    public LinkedList<PParametersSequence> getParametersSequence()
    {
        return this._parametersSequence_;
    }

    public void setParametersSequence(List<PParametersSequence> list)
    {
        this._parametersSequence_.clear();
        this._parametersSequence_.addAll(list);
        for(PParametersSequence e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parameter_)
            + toString(this._parametersSequence_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parameter_ == child)
        {
            this._parameter_ = null;
            return;
        }

        if(this._parametersSequence_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parameter_ == oldChild)
        {
            setParameter((PParameter) newChild);
            return;
        }

        for(ListIterator<PParametersSequence> i = this._parametersSequence_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametersSequence) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
