package lab17;

import java.util.HashMap;
import java.util.Map;
public class TablesOrderManager {
    private static final int size = 15; //Количество столмков
    private String[] table;
    private Map<String,Order> orders = new HashMap<String, Order>();
    public TablesOrderManager(RestaurantOrder restaurantOrder) {
        table = new String[restaurantOrder.getOrders()];
        int i = 0;
        for(Item order : restaurantOrder.getDishes()) {
            table[i] = order.getDescription() + ":  " + order.getName() + " " + order.getCost() + "руб";
            ++i;
        }
        for(Item order : restaurantOrder.getDrinks()) {
            table[i] = order.getDescription() + ":  " + order.getName() + " " + order.getCost() + "руб";
            ++i;
        }
    }
    public boolean add(String address){
        return false;
    }
    public void get(String address){
        //return
    }
    public boolean remove(String address){
        return false;
    }
    public boolean setDescription(String address, Item item){
        return false;
    }
    public void printTable(){
        for (String s : table) {
            System.out.println(s);
        }
    }

}