package lab11;
import java.util.Arrays;

public class ArrayQueueModule implements ArrayQueueADT {
    static private final int[] arr = new int[100];
    static private int first_position;
    static private int last_position;


    public ArrayQueueModule() {}

    public void enqueue(int value) throws ArrayStoreException {
        if (full()) {
            throw new ArrayStoreException("Queue is overloaded");
        }
        arr[last_position%arr.length] = value;
        last_position++;
    }

    public int element() throws ArrayIndexOutOfBoundsException {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
        return arr[(last_position-1)%arr.length];
    }

    public int dequeue() throws ArrayIndexOutOfBoundsException {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
        int value = arr[first_position];
        first_position++;
        return value;
    }

    public int size() {
        return last_position-first_position;
    }

    public boolean isEmpty() {
        return first_position==last_position;
    }

    public boolean full() {
        return last_position-first_position > arr.length;
    }

    public void clear() {
        first_position = 0;
        last_position = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = first_position; i < last_position-1; i++) {
            sb.append(arr[i]);
            sb.append(", ");
        }
        sb.append(element());
        sb.append(']');
        return sb.toString();
    }
}
