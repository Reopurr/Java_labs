package lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent
{
    public static void main(String[] args)
    {
        lab6.Student st[] = new lab6.Student[30];
        List<lab6.Student> stu = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            st[i] = new lab6.Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu.add(new lab6.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
        }
        Comparator<Student> comp = new SortingStudentsByGPA();
        stu.sort(comp);
        System.out.println("Id:\tBall:");
        for (Student i: stu)
        {
            System.out.println(i);
        }
    }
}
