package Lab9.Ex91;

import java.util.Scanner;

public class Test4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(fact(a));
    }

    public static int fact(int n)
    {
        int result;
        if (n == 1)
            return 1;
        else
        {
            result = fact(n-1)*n;
            return result;
        }
    }
}