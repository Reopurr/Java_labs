package labnumb3;

abstract class Shape {
    protected String Color;
    protected Boolean Filled;
    Shape(){}
    Shape(String Color, Boolean Filled) {
    this.Color = Color;
    this.Filled = Filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    public boolean isFilled(){
        return Filled;
    }

    public void setFilled(Boolean filled) {
        Filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", Filled=" + Filled +
                '}';
    }
}
