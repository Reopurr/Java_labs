package laboratornie;

public class Head {
    private int eyes, ears;
    private boolean eye;
    Head(int ears, int eyes, boolean eye){
        this.ears = ears;
        this.eyes = eyes;
        this.eye = true;
    }
    public void Checkifeyeopened() {
        if (this.eye==true)
            System.out.println("Eye is opened");
        else
            System.out.println("Eye is closed");
    }

    public int getEars() {
        return ears;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public void setEye(boolean eye) {
        this.eye = eye;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eyes=" + eyes +
                ", ears=" + ears +
                ", eye=" + eye +
                '}';
    }
}
