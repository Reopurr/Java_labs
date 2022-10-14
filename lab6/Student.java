package lab6;
public class Student
{
    private int iDNumber;
    private int bal;

    // Конструктор.
    public Student(int iDNumber, int bal)
    {
        this.iDNumber = iDNumber;
        this.bal = bal;
    }

    // Геттеры и сеттеры.

    public void setBal(int bal)
    {
        this.bal = bal;
    }

    public int getBal()
    {
        return bal;
    }

    public int getiDNumber()
    {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber)
    {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString()
    {
        return iDNumber + " " + bal;
    }
}