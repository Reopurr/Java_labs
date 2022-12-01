package lab32;

public class Drink implements Item {
    private String name;
    private int cost = 0;
    private String description;

    public Drink(Double cost, String name, String description) {
        this.cost = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(String name, String description, int cost) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }
    public int getCost()
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