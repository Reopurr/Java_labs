package lab26;

import java.util.Scanner;
public class Exception6 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try
        {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch ( Exception e)
        {
            throw e;
        }
    }
    private String getDetails(String key)
    {
        if(key == "")
        {
            //  throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}