package lab24;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<String>();
        city.add("Москва");
        city.add("Санкт-Петербург");
        city.add("Казань");
        city.add("Чебоксары");
        city.add("Самара");
        city.add("Владивосток");
        city.add("Севастополь");
        city.add("Брянск");
        city.add("Магадан");
        city.add("Чита");
        System.out.printf("В списке %d элементов \n", city.size());
        System.out.println("Введите номер города в интервале 0-9");
        int a = sc.nextInt();
        System.out.println(city.get(5));
        System.out.println("Все города в списке: ");
        for (String state : city) {

            System.out.println(state);

        }
        if(city.contains("Чебоксары")){

            System.out.println("Список содержит город Чебоксары");
        }
    }
}