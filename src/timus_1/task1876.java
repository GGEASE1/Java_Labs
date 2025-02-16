package timus_1;

import java.util.Scanner;

public class task1876
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int time = Math.max(2*b+40,2*a+39);

        System.out.println(time);
    }
}
