package lab29;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EX3 {
    public static ArrayList<String> FindRuEuUSD(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
}