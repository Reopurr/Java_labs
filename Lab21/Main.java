package Lab21;

import javax.lang.model.element.Name;

class Animals implements Nameable{
    String name;
    String breed;
    int years;
    Animals(String name, String breed, int years){
        this.name = name;
        this.breed = breed;
        this.years = years;
    }
    public void GetName(){
        System.out.println("Name= " + name + "\nBreed= "+ breed+"\nYears= " +years);
    }
}
class Woker implements  Nameable{
    String name;
    Woker(String name){
        this.name = name;
    }
    public void GetName(){
        System.out.println("Name = " + name);
    }
}

public class Main {
    public static void  main (String[] args){
        Animals b1 = new Animals("Bobik", "Coyote", 3);
        Woker b2 = new Woker("Vitaliy");
        b1.GetName();
        b2.GetName();
    }
}