package lab16;

public interface Order {
    boolean add(Item order);
    boolean remove(String orderName);
    int removeAll(String orderName);
    int getOrders();
    Integer[] getOrderPosition();
    Double getCost();
}