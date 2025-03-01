package Lab9.Ex91;

import java.util.Scanner;

public class Test1
{
    public static void m(int x)
    {
        System.out.println("x=" + x);
        if((2*x+1)<20)
        {
            m(2*x+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        m(a);
    }
}
