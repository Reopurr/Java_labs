package lab26;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 first = new Exception1();
        Exception2 second = new Exception2();
        Exception3 third = new Exception3();
        Exception4 fourth = new Exception4();
        Exception5 five = new Exception5();
        Exception6 six = new Exception6();
        Exception7 seven = new Exception7();
        Exception8 eight = new Exception8();
        System.out.println("Задание 1:");
        first.exceptionDemo();
        System.out.println("Задание 2:");
        second.exceptionDemo2();
        System.out.println("Задание 3:");
        third.exceptionDemo3();
        System.out.println("Задание 4:");
        fourth.exceptionDemo4();
        System.out.println("Задание 5:");
        five.printMessageSafe("key");
        five.getDetailsSafe(null);
        System.out.println("Задание 6:");
        six.printDetails("key");
        six.getKey();
        System.out.println("Задание 7:");
        try {
            seven.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Задание 8:");
        try {
            eight.getKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
