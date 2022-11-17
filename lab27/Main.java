package lab27;
import java.util.Collections;
import java.util.LinkedList;

class Main {
    public static <T> LinkedList<T> convert_to_list(T[] arr) {
        var ll = new LinkedList<T>();
        Collections.addAll(ll, arr);
        return ll;
    }
    public static void main(String[] args) {

        System.out.println(convert_to_list(new String[]{"Привет", "прекрасный", "мир"}));

        var a = new Conversion<>(Integer.class, 100);
        a.set(23, 0);
        a.set(12512431, 5);
        a.set(-12312, 65);
        a.set(-0, 4);
        a.set(456, 99);
        System.out.println(a);

        System.out.println(a.get(99));
        System.out.println(a.get(65));
        System.out.println(a.get(54));
    }
}

