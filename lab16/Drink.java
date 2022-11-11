package lab16;

import java.lang.IllegalArgumentException;
public class Drink implements Item {
    private String name;
    private double cost = 0;
    private String description;

    public Drink(Double cost, String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description, double cost) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public Double getCost()
    {
        return this.cost;
    }
    public  String getName()
    {
        return this.name;
    }
    public  String getDescription()
    {
        return this.description;
    }
}