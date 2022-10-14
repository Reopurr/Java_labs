package lab20;

class Shpic extends Dog {
    private String breed;
    Shpic(String name, String color, int age) {
        super(name, color, age);
        this.breed = "Shpic";
    }

    Shpic(String name, String color) {
        super(color);
        this.breed = "Shpic";
    }

    Shpic(String name) {
        this.breed = "Shpic";
    }

    @Override
    public String toString() {
        return "Shpic{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
