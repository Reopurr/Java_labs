package labnumb3;

class Rectangle extends Shape {
    protected double width, length;
    Rectangle(){
        this.Filled = false;
        this.Color = "Blue";
        width = 0;
        length = 0;
    }
    Rectangle(double width, double length){
        this.Filled = false;
        this.Color = "Blue";
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String Color, boolean Filled){
        super(Color,Filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
