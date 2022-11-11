package lab13;
class Main {

    public static void main(String[] args) {
        CompexAbstractFactory complexFactory = new ConcreteFactory();
        Complex complex = complexFactory.createComplex(2002, 19);
        System.out.println(complex);
    }
}

