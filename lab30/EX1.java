package lab30;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX1 {
    public static boolean checkEmail(String s) {
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+").matcher(s);
        return m.find() && m.group().equals(s);
    }
}