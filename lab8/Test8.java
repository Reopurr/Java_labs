package lab8;

import java.util.ArrayList;
import java.util.Collection;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        arr.add(8);
        WaitList<Integer> o1 = new WaitList<Integer>(arr);
        o1.add(2);
        System.out.println(o1.toString());
        if (!o1.isEmpty())
            System.out.println("remove: " + o1.remove());
        System.out.println("contains: " + o1.contains(33));
        System.out.println("containsAll: " + o1.containsAll(arr));
        System.out.println("isEmpty: " + o1.isEmpty());
        System.out.println(o1.toString());
        System.out.println("");
        BoundedWaitList<Integer> o2 = new BoundedWaitList<Integer>(arr);
        o2.add(2);
        System.out.println(o2.toString());
        if (!o1.isEmpty())
            System.out.println("remove: " + o2.remove());
        System.out.println("contains: " + o2.contains(50));
        System.out.println("containsAll: " + o2.containsAll(arr));
        System.out.println("isEmpty: " + o2.isEmpty());
        System.out.println(o2.toString());
        System.out.println("");
        UnfairWaitList<Integer> o3 = new UnfairWaitList<Integer>();
        o3.add(1);
        o3.add(2);
        o3.add(3);
        o3.add(4);
        o3.add(5);
        o3.add(10000);
        o3.add(20000);
        System.out.println(o3.toString());
        if (!o1.isEmpty())
            System.out.println("remove: " + o3.remove());
        System.out.println("contains: " + o3.contains(100));
        System.out.println("containsAll: " + o3.containsAll(arr));
        System.out.println("isEmpty: " + o3.isEmpty());
        System.out.println(o3.toString());
        o3.remove(2);
        System.out.println("Remove - 2 " + o3.toString());
        o3.moveToBack(3);
        System.out.println("moveToBack  - 5 " + o3.toString());
    }
}