package lab32;

public class Dish implements Item {
    private int cost;
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(int cost, String title, String description) {
        try{
            if(cost < 0){
                throw new IllegalArgumentException("Цена не можеть быть отрецательной");
            }
            else {
                this.name = name;
                this.description = description;
                this.cost = cost;
            }
        }catch (IllegalAccessError err){
            System.out.println("Цена не можеть быть отрецательной");
        }
    }

    public Dish() { }

    public int getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

}