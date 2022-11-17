package lab17;

public interface Item {
    Double getCost();
    String getName();
    String getDescription();
    void setCost(double cost);
    void setName(String name);
    void setDescription(String description);
}