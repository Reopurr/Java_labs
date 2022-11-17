package lab30;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(EX1.checkEmail("workvit2002@gmail.com"));
        System.out.println(EX1.checkEmail("workvit2002@@@gmail.com"));
        System.out.println("Задание 2:");
        System.out.println(EX2.checkPassword("F032_Password"));
        System.out.println(EX2.checkPassword("A"));
    }
}