package lab12;

import java.util.Collections;
import java.util.LinkedList;

class Main {
    public static String getLine(String[] strings) {
        var builder = new StringBuilder();
        builder.append(strings[0]);

        LinkedList<String> values = new LinkedList<>();
        for (int i = 1; i < strings.length; i++) {
            values.add(strings[i]);
        }

        boolean found;
        while (values.size() != 0) {
            found = false;
            for (int i = 0; i < values.size(); i++) {
                if (builder.charAt(builder.length()-1) == values.get(i).charAt(0)) {
                    builder.append(values.remove(i).substring(1));
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new RuntimeException("There's no connection from " +
                        builder + " and words " + values);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].trim().toLowerCase();
        }
        System.out.println(getLine(args));
    }
}
