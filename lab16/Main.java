package lab16;

public class Main {
    public static void main(String[] args) {
        InternetOrder tablesOrderManager = new InternetOrder() {
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Dish(2.5,"Pepsi", "dish"));
        System.out.println("Итоговая стоииость: " + internetOrder.costTotal() + "$");
    }
}