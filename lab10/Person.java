package lab10;

public class Person {
    String name = null;
    String surname = null;
    String patronymics = null;


    public Person(String name, String surname, String patronymics) {
        this.name = name;
        this.surname = surname;
        this.patronymics = patronymics;
    }

    public Person (String name, String surname) {
        this(name, surname, null);
    }

    public Person (String FCs) throws IllegalArgumentException{
        var values = FCs.split(" ");
        if (values.length < 2) {
            throw new IllegalArgumentException("FCs string should include name and surname at least");
        }
        name = values[0];
        surname = values[1];

        if (values.length == 3) {
            patronymics = values[2];
        }
    }

    @Override
    public String toString() {
        if (patronymics == null) {
            return "Person " + name + ' ' + surname;
        } else {
            return "Person " + name + ' ' + surname + ' ' + patronymics;
        }
    }
}
