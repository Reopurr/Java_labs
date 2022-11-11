package lab16;

public class Dish implements Item{
    private Double cost;
    private String name;
    private String description;

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0.0;
    }

    public Dish(Double cost, String title, String description) {
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

    public Double getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

}