package laboratornie;

public class Human {
    public static void main(String[] args){
        Head golova = new Head(2,2,true);
        System.out.println(golova);
        golova.Checkifeyeopened();
        Leg noga = new Leg(45,41);
        System.out.println(noga);
        noga.Cutleg();
        System.out.println(noga);
        Hand ruka = new Hand(5,2);
        System.out.println(ruka);
        ruka.GoToGym();
        System.out.println(ruka);
    }
}
