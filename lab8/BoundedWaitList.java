package lab8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public BoundedWaitList(Collection<E> c){
        System.out.print("Размер списка: ");
        Scanner in = new Scanner(System.in);
        capacity = in.nextInt();
        Iterator<E> it = c.iterator();
        while (it.hasNext() && content.size()<capacity)
            content.add(it.next());
    }
    public int getCapacity() {
        return capacity;
    }
    public void add(E element){
        if (content.size() < capacity)
            content.add(element);
        else
            System.out.println("Список заполнен");
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                "} " + content;
    }
}