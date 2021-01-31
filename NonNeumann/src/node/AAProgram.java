/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AAProgram extends PAProgram
{
    private final LinkedList<PAFunctionDescription> _aFunctionDescription_ = new LinkedList<PAFunctionDescription>();

    public AAProgram()
    {
        // Constructor
    }

    public AAProgram(
        @SuppressWarnings("hiding") List<PAFunctionDescription> _aFunctionDescription_)
    {
        // Constructor
        setAFunctionDescription(_aFunctionDescription_);

    }

    @Override
    public Object clone()
    {
        return new AAProgram(
            cloneList(this._aFunctionDescription_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAProgram(this);
    }

    public LinkedList<PAFunctionDescription> getAFunctionDescription()
    {
        return this._aFunctionDescription_;
    }

    public void setAFunctionDescription(List<PAFunctionDescription> list)
    {
        this._aFunctionDescription_.clear();
        this._aFunctionDescription_.addAll(list);
        for(PAFunctionDescription e : list)
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
            + toString(this._aFunctionDescription_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._aFunctionDescription_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAFunctionDescription> i = this._aFunctionDescription_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAFunctionDescription) newChild);
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
