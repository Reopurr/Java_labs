package lab14;

public class MagicChair implements Chair {
    public void doMagic() {
        throw new RuntimeException("Magic!");
    }
}
