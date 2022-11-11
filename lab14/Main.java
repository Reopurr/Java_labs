package lab14;

class Main {

    public static void main(String[] args) {
        AbstractChairFactory cf = new ChairFactory();
        Client cl = new Client();

        cl.setChair(cf.createVictorianChair());
        System.out.println(cl);
    }
}