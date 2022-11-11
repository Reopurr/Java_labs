package lab26;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo4()
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
        finally {
            System.out.println("Finally");
        }
    }
}
