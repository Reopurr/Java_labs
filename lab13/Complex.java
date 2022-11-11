package lab13;
public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        setReal(real);
        setImage(image);
    }
    public Complex(int real) { this(real, 0); }
    public Complex() { this(0, 0); }

    public int getReal() { return real; }
    public int getImage() { return image; }
    public void setReal(int real) { this.real = real; }
    public void setImage(int image) { this.image = image; }

    @Override
    public String toString() {
        return "" + real + " * i^" + image;
    }
}
