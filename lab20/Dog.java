package lab20;

public abstract class Dog {
    protected String name, color;
    protected int age;
    Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    Dog(String name, String color){
        this.name = name;
        this.name = color;
        this.age = 0;
    }
    Dog(String name){
        this.name = name;
        this.color = "White";
        this.age = 0;
    }

    public Dog() {
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
