package lab8;

import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
    }
    public void remove(E element) {
        Iterator<E> it = content.iterator();
        while (it.hasNext())
            if (it.next() == element)
                it.remove();
    }
    public void moveToBack(E element) {
        Iterator<E> it = content.iterator();
        while (it.hasNext()) {
            E a = it.next();
            if (a == element){
                it.remove();
                content.add(a);
                break;
            }
        }

    }
}