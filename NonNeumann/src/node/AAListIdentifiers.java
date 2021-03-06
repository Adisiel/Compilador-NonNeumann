/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AAListIdentifiers extends PAListIdentifiers
{
    private TIdentifier _identifier_;
    private final LinkedList<PAListIdentifiersSequence> _aListIdentifiersSequence_ = new LinkedList<PAListIdentifiersSequence>();

    public AAListIdentifiers()
    {
        // Constructor
    }

    public AAListIdentifiers(
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") List<PAListIdentifiersSequence> _aListIdentifiersSequence_)
    {
        // Constructor
        setIdentifier(_identifier_);

        setAListIdentifiersSequence(_aListIdentifiersSequence_);

    }

    @Override
    public Object clone()
    {
        return new AAListIdentifiers(
            cloneNode(this._identifier_),
            cloneList(this._aListIdentifiersSequence_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAListIdentifiers(this);
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public LinkedList<PAListIdentifiersSequence> getAListIdentifiersSequence()
    {
        return this._aListIdentifiersSequence_;
    }

    public void setAListIdentifiersSequence(List<PAListIdentifiersSequence> list)
    {
        this._aListIdentifiersSequence_.clear();
        this._aListIdentifiersSequence_.addAll(list);
        for(PAListIdentifiersSequence e : list)
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
            + toString(this._identifier_)
            + toString(this._aListIdentifiersSequence_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._aListIdentifiersSequence_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        for(ListIterator<PAListIdentifiersSequence> i = this._aListIdentifiersSequence_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAListIdentifiersSequence) newChild);
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
