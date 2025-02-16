package timus_1;

import java.util.Scanner;

public class task1068
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;

        if (N < 1)
        {
            for (int i = N; i <= 1; i++)
            {
                result = (N + 1) * (2 - (N)) / 2;
            }
        }
        else
        {
            result = (1 + N) * N / 2;
        }
        System.out.println(result);
    }
}