package laboratornie;

public class Leg {
    private int length, foot_length_eu;
    Leg(int length, int foot_length_eu){
        this.length = length;
        this.foot_length_eu = foot_length_eu;
    }
    public void Cutleg(){
        this.length = 0;
        this.foot_length_eu = 0;
    }

    public int getFoot_length_eu() {
        return foot_length_eu;
    }

    public int getLength() {
        return length;
    }

    public void setFoot_length_eu(int foot_length_eu) {
        this.foot_length_eu = foot_length_eu;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                ", foot_length_eu=" + foot_length_eu +
                '}';
    }
}
