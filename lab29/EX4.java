package lab29;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX4 {
    public static boolean Plus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }
}