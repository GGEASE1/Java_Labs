package timus_2;

import java.util.Scanner;

public class task1225
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        long[] dp = new long[N + 2];

        dp[0] = 2;
        dp[1] = 2;

        for (int i = 2; i < N+2; i++)
        {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.println(dp[N-1]);
    }
}
