package laboratornie;

public class Hand {
    private int fingers, level_of_strength;
    Hand(int fingers, int level_of_strength ){
        this.fingers = fingers;
        this.level_of_strength = level_of_strength;
    }
    public void GoToGym(){
    this.level_of_strength+=1;
    }

    public int getFingers() {
        return fingers;
    }

    public int getLevel_of_strength() {
        return level_of_strength;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public void setLevel_of_strength(int level_of_strength) {
        this.level_of_strength = level_of_strength;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "fingers=" + fingers +
                ", level_of_strength=" + level_of_strength +
                '}';
    }
}
