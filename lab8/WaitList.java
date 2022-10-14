package lab8;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<E>();
    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        Iterator<E> it = c.iterator();
        while (it.hasNext())
            if (!content.contains(it.next()))
                return false;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
    public WaitList() {
    }
    public WaitList(Collection<E> c) {
        Iterator<E> it = c.iterator();
        while (it.hasNext())
            content.add(it.next());
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}