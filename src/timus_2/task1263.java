package timus_2;

import java.util.Scanner;

public class task1263
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] votes = new int[n];

        for (int i = 0; i < m; i++)
        {
            int candidate = in.nextInt() - 1;
            votes[candidate]++;
        }
        double totalVotes = m * 1.0;
        for (int vote : votes)
        {
            System.out.printf("%.2f%%\n", (vote / totalVotes) * 100);
        }
    }
}