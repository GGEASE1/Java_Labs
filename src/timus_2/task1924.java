package timus_2;

import java.util.Scanner;

public class task1924
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum = N*(N+1)/2;
        if(sum%2==0)
        {
            System.out.println("black");
        }
        else
        {
            System.out.println("grimy");
        }
    }
}
