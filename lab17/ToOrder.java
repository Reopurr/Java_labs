package lab17;

public class ToOrder extends RestaurantOrder{
    public ToOrder(String title, String description) {
        super(title, description);
    }
    public ToOrder(Double cost, String name, String description) {
        super(cost, name, description);
    }
}