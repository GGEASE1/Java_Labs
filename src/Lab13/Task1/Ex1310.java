package Lab13.Task1;

public class Ex1310
{
    public static int m()
    {
        try
        {
            System.out.println("0");
            return 15;
        }
        finally
        {
            System.out.println("1");
            //return 20; если указать return в try не выполниться
        }
    }

    public static void main(String[] args)
    {
        System.out.println(m());
    }
}
