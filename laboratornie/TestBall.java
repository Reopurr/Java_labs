package laboratornie;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        Ball b2 = new Ball();
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        b2.setXY(10, 15);
        System.out.println(b2);
    }
}
