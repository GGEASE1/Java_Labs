package Lab9.Ex91;

import java.util.Scanner;

public class Test3
{
    private static int step = 0;

    public static void m(int x)
    {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if((2*x+1)<20)
        {
            m(2*x+1);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space()
    {
        for (int i=0;i<step;i++)
        {
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        m(a);
    }
}
