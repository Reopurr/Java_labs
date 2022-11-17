package lab27;
import java.lang.reflect.Array;

public class Conversion<T> {
    private final T[] arr;

    public Conversion(Class<T> cl, int capacity) {
        final T[] arr = (T[]) Array.newInstance(cl, capacity);
        this.arr = arr;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(T value, int index) {
        if (index > arr.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Индекс " + index + " находится вне диапазона[0, " + arr.length + "]");
        }
        arr[index] = value;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append('[');
        int previous = 0;
        int next = 0;

        while (previous < arr.length && arr[previous] == null) {
            previous++;
        }

        if (previous == arr.length) {
            return "[]";
        }
        next = previous;

        while (++next < arr.length) {
            if (arr[next] == null) {
                continue;
            }
            builder.append(arr[previous]).append(", ");
            previous = next;
        }
        builder.append(arr[previous]).append(']');
        return builder.toString();
    }
}
