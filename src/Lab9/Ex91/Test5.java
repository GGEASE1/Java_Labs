package Lab9.Ex91;

public class Test5 {
    public static void main(String[] args)
    {
        System.out.println(fact(8));
    }

    public static int fact(int n)
    {
        System.out.println("fact(" + n + ")");

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
            int res = fact(n - 2) + fact(n - 1);
            System.out.println("Возвращено: " + res);
            return res;
        }
    }
}
