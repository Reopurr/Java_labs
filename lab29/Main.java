package lab29;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн:");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
        System.out.println("Задание 2:");
        System.out.println(EX2.Stroka("abcdefghijklmnopqrstuv18340"));
        System.out.println(EX2.Stroka("abcdefghijklmnoasdfasdpqrstuv18340"));
        System.out.println("Задание 3:");
        System.out.println(EX3.FindRuEuUSD("25.98 USD."));
        System.out.println("Задание 4:");
        System.out.println(EX4.Plus("(1 + 8) – 9 / 4."));
        System.out.println(EX4.Plus("6 / 5 – 2 * 9 ."));
        System.out.println("Задание 5:");
        System.out.println(EX5.Date("12/12/2001"));
    }
}
