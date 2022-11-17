package lab17;

import java.util.HashMap;
import java.util.Map;
public class InternetOrder implements Order{
    private static final int size = 15; //Количество столмков
    public static Map<Integer,Item> orders = new HashMap<>();
    public InternetOrder() { }
    public InternetOrder(RestaurantOrder[] orders) { }
    public boolean add(Item order) {
        if ((orders.size() <= size) && (orders.get(orders.size()) == null)) {
            orders.put(orders.size(), order);
            return true;
        }
        return false;
    }
    public boolean remove(String orderName) {
        for (Map.Entry entry : orders.entrySet())
            if (entry.getValue().toString().equals(orderName)) {
                orders.remove(entry.getKey(), entry.getValue());
                return true;
            } else {
                return false;
            }
        return false;
    }
    public int removeAll(String orderName) {
        int count = orders.size();
        orders.values().remove(orderName);
        return count - orders.size();
    }
    public int getOrders() {
        return orders.size();
    }
    public Integer[] getOrderPosition() {
        return orders.keySet().toArray(new Integer[0]);
    }
    public Double getCost() {
        return this.getCost();
    }
    public double costTotal(){
        double sum = 0;
        for(Item i : orders.values()) {
            sum += i.getCost();
        }
        return sum;
    }
}
