package lab10;

class Main {
    public static void main(String[] args) {

        var p = new Person("vit", "k", "r");
        System.out.println(p);
        p = new Person("vitaliy", "kom");
        System.out.println(p);
        p = new Person("vitaliy komarov rom");
        System.out.println(p);

        Address add = new Address("Russia,SAO,Moscow,Khodinskiy_Boulevard,19,7/1,139");
        System.out.println(add);
        System.out.println(add.getHouse_case());

        var shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        var shirts_class = new Shirt(shirts);
        System.out.println(shirts_class);
    }
}

