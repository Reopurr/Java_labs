package lab28;

import java.io.File;
import java.util.*;

class Main {

    public static LinkedList<File> showFiles(File[] files) {
        var ll = new LinkedList<File>();
        if (files == null) {
            return ll;
        }
        Collections.addAll(ll, files);
        return ll;
    }

    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... vars) {
        var al = new ArrayList<T>();
        Collections.addAll(al, vars);
        return al;
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... vars) {
        var al = new HashSet<T>();
        Collections.addAll(al, vars);
        return al;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] Kvar, V[] Vvar) throws IllegalArgumentException {
        var al = new HashMap<K, V>();

        if (Kvar.length != Vvar.length) {
            throw new IllegalArgumentException("Kvar and Vvar have different length");
        }

        for (int i = 0; i < Kvar.length; i++) {
            al.put(Kvar[i], Vvar[i]);
        }

        return al;
    }

    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir"));

        LinkedList<File> files = showFiles(dir.listFiles());

        int counter = 0;
        for (var f : files) {
            System.out.println(f.getName());
            if (++counter == 5) {
                break;
            }
        }

        System.out.println("\n\n");

        ArrayList<Integer> al = newArrayList(15, 123 ,123);
        System.out.println(al);
        HashSet<Long> hs = newHashSet(-111L, 222L, -333L, 444L, -555L);
        System.out.println(hs);
        HashMap<Short, String> hm = newHashMap(new Short[]{2,22}, new String[]{"x","Текст"});
        System.out.println(hm);

    }
}

