package lab17;

import java.util.HashMap;
import java.util.Map;

public interface OrderManager {
    Map<Integer, Item > orders = new HashMap<>();
    void add(RestaurantOrder order, int tableNumber);
    Item getOrder(int tableNumber);
    Item[] getOrders();
    void addOrder(Item order, int tableNumber);
    void removeOrder(int tableNumber);
    int freeTableNumber();
    int[] freeTableNumbers();
    double ordersCostSummary();
    int orderQuantity(String dishName);
}
