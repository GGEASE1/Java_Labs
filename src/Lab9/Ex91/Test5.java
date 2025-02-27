package Lab9.Ex91;

public class Test5
{
    public static void main(String[] args)
    {
        System.out.println(fib(8));
    }

    public static int fib(int n)
    {
        System.out.println(n);

        if (n == 0)
        {
            System.out.println("Возвращено: 0");
            return 0;
        }
        else if (n == 1)
        {
            System.out.println("Возвращено: 1");
            return 1;
        }
        else
        {
            int res = fib(n - 2) + fib(n - 1);
            System.out.println("Возвращено: " + res);
            return res;
        }
    }
}
