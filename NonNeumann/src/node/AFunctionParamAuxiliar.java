/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AFunctionParamAuxiliar extends PFunctionParamAuxiliar
{
    private TLeftParentheses _leftParentheses_;
    private final LinkedList<PParameters> _parameters_ = new LinkedList<PParameters>();
    private TRightParentheses _rightParentheses_;

    public AFunctionParamAuxiliar()
    {
        // Constructor
    }

    public AFunctionParamAuxiliar(
        @SuppressWarnings("hiding") TLeftParentheses _leftParentheses_,
        @SuppressWarnings("hiding") List<PParameters> _parameters_,
        @SuppressWarnings("hiding") TRightParentheses _rightParentheses_)
    {
        // Constructor
        setLeftParentheses(_leftParentheses_);

        setParameters(_parameters_);

        setRightParentheses(_rightParentheses_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionParamAuxiliar(
            cloneNode(this._leftParentheses_),
            cloneList(this._parameters_),
            cloneNode(this._rightParentheses_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionParamAuxiliar(this);
    }

    public TLeftParentheses getLeftParentheses()
    {
        return this._leftParentheses_;
    }

    public void setLeftParentheses(TLeftParentheses node)
    {
        if(this._leftParentheses_ != null)
        {
            this._leftParentheses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftParentheses_ = node;
    }

    public LinkedList<PParameters> getParameters()
    {
        return this._parameters_;
    }

    public void setParameters(List<PParameters> list)
    {
        this._parameters_.clear();
        this._parameters_.addAll(list);
        for(PParameters e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public TRightParentheses getRightParentheses()
    {
        return this._rightParentheses_;
    }

    public void setRightParentheses(TRightParentheses node)
    {
        if(this._rightParentheses_ != null)
        {
            this._rightParentheses_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightParentheses_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leftParentheses_)
            + toString(this._parameters_)
            + toString(this._rightParentheses_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leftParentheses_ == child)
        {
            this._leftParentheses_ = null;
            return;
        }

        if(this._parameters_.remove(child))
        {
            return;
        }

        if(this._rightParentheses_ == child)
        {
            this._rightParentheses_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leftParentheses_ == oldChild)
        {
            setLeftParentheses((TLeftParentheses) newChild);
            return;
        }

        for(ListIterator<PParameters> i = this._parameters_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParameters) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rightParentheses_ == oldChild)
        {
            setRightParentheses((TRightParentheses) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
