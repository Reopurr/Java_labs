package lab26;

import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo2()
    {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try {
            System.out.println(2.0 / i);
        } catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero or word");
        }
    }
}