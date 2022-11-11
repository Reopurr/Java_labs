package lab14;

public record VictorianChair (int age) implements Chair {
    @Override
    public String toString() {
        return "Викторианским стулом{"+age+"}";
    }
}
