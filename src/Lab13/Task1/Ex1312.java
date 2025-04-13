package Lab13.Task1;

public class Ex1312
{
    public static void m(String str, double chislo)
    {
        if (str == null)
        {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001)
        {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args)
    {
        m("Строка", 0.0001);
    }
}
