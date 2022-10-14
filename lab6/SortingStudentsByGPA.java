package lab6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<lab6.Student>
{
    @Override
    public int compare(lab6.Student o1, lab6.Student o2)
    {
        return -(o1.getBal() - o2.getBal());
    }
}