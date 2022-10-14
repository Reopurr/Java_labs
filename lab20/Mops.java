package lab20;

class Mops extends Dog {
    private String breed;
    Mops(String name, String color, int age) {
        super(name, color, age);
        this.breed = "Mops";
    }

    Mops(String name, String color) {
        super(color);
        this.breed = "Mops";
    }

    Mops(String name) {
        this.breed = "Mops";
    }

    @Override
    public String toString() {
        return "Mops{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
