package Lab13.Task1;

public class Ex132
{
        public static void main(String[] args)
        {
        try
        {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1"); строка не выполниться
        }
        catch (Exception e)
        {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }

}
