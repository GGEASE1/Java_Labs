package timus;

import java.util.Scanner;

public class task1068
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        long sum = (long)N * (N + 1) / 2;

        System.out.println(sum);
    }
}