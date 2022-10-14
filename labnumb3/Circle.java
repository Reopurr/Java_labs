package labnumb3;
import java.math.*;

class Circle extends Shape {
    protected double radius;
    Circle(){
        this.Filled = false;
        this.Color = "Blue";
        radius = 1;
    }
    Circle(double radius){
        this.radius = radius;
        this.Filled = false;
        this.Color = "Blue";
    }
    Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
