package lab17;

import java.lang.IllegalArgumentException;
public final class Drink implements Item{
    private Double cost;
    private String name;
    private String description;
    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0.;
    }
    public Drink(Double cost, String name, String description) {
        try{
            if(cost < 0){
                throw new IllegalArgumentException("Цена не можеть быть отрецательной");
            }
            else {
                this.cost = cost;
                this.name = name;
                this.description = description;
            }
        }catch (IllegalArgumentException err){
            System.out.println("Цена не можеть быть отрецательной");
        }
    }
    public Double getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public void setCost(double cost){
        try {
            if(cost < 0){
                throw new IllegalArgumentException("Цена не можеть быть отрецательной");
            }
            else {
                this.cost = cost;
            }
        }catch (IllegalAccessError err){
            System.out.println("Цена не можеть быть отрецательной");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}