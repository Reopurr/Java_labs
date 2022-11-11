package lab14;


public class Client {
    public Chair chair;

    public void sit() throws RuntimeException {
        if (chair == null) {
            throw new RuntimeException("У клиента нет стула чтобы сидеть");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Клиент с "+chair;
    }
}
