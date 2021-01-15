/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AParametersAssign extends PParametersAssign
{
    private PParameterAssign _parameterAssign_;
    private final LinkedList<PParametersAssignAux> _parametersAssignAux_ = new LinkedList<PParametersAssignAux>();

    public AParametersAssign()
    {
        // Constructor
    }

    public AParametersAssign(
        @SuppressWarnings("hiding") PParameterAssign _parameterAssign_,
        @SuppressWarnings("hiding") List<PParametersAssignAux> _parametersAssignAux_)
    {
        // Constructor
        setParameterAssign(_parameterAssign_);

        setParametersAssignAux(_parametersAssignAux_);

    }

    @Override
    public Object clone()
    {
        return new AParametersAssign(
            cloneNode(this._parameterAssign_),
            cloneList(this._parametersAssignAux_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParametersAssign(this);
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

    public LinkedList<PParametersAssignAux> getParametersAssignAux()
    {
        return this._parametersAssignAux_;
    }

    public void setParametersAssignAux(List<PParametersAssignAux> list)
    {
        this._parametersAssignAux_.clear();
        this._parametersAssignAux_.addAll(list);
        for(PParametersAssignAux e : list)
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
            + toString(this._parameterAssign_)
            + toString(this._parametersAssignAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parameterAssign_ == child)
        {
            this._parameterAssign_ = null;
            return;
        }

        if(this._parametersAssignAux_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parameterAssign_ == oldChild)
        {
            setParameterAssign((PParameterAssign) newChild);
            return;
        }

        for(ListIterator<PParametersAssignAux> i = this._parametersAssignAux_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParametersAssignAux) newChild);
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
