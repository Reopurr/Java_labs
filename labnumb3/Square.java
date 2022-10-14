package labnumb3;
class Square extends Rectangle {
    Square(){
        this.width = 0;
        this.length =0;
        this.Color = "Blue";
        this.Filled = false;
    }
    Square(double side){
        super(side,side);
        this.Filled = false;
        this.Color = "Blue";
    }
    Square(double side, String Color, boolean Filled){
        super(side,side,Color,Filled);
    }
    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public double getPerimeter() {
        return 4*width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
