package lab17;

public class Main {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder() {
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };
        restaurantOrder.add(new Drink(120.0,"Пепси", "Напиток"));
        restaurantOrder.add(new Drink(99.0,"Сок яблочный", "Напиток"));
        restaurantOrder.add(new Dish(300.0,"Суп", "Блюдо"));
        restaurantOrder.add(new Dish(100.0,"Чизбургер", "Блюдо"));
        TablesOrderManager tablesOrderManager = new TablesOrderManager(restaurantOrder);
        tablesOrderManager.printTable();
        System.out.println("Чек: " + restaurantOrder.costTotal() + "руб\n");
    }
}
