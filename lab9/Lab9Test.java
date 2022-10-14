package lab9;

import java.util.ArrayList;

public class Lab9Test {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Комаров Виталий Романович", 84, 1, 20));
        s.add(new Student("Солдатов Андрей Тимофеевич", 77, 1, 20));
        s.add(new Student("Бояковский Вячеслав Валерьевич", 99, 3, 18));
        s.add(new Student("Смолкин Михаил Романович", 76, 2, 19));
        new LabClassUi(s);
    }
}