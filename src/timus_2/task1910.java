package timus_2;

import java.util.Scanner;

public class task1910
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }

        int maxSum = 0;
        int bestMid = 0;

        for (int i = 0; i <= n - 3; i++)
        {
            int curSum = a[i] + a[i + 1] + a[i + 2];
            if (curSum > maxSum)
            {
                maxSum = curSum;
                bestMid = i + 1;
            }
        }

        System.out.println(maxSum + " " + (bestMid + 1));
    }
}