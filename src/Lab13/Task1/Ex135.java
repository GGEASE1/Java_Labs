package Lab13.Task1;

public class Ex135
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        catch (RuntimeException e)
        {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
