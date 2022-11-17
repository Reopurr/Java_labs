package lab30;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX2 {
    public static boolean checkPassword(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }
}
