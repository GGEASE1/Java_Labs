package timus_2;

import java.util.Scanner;

public class task1110
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();

        boolean found = false;

        for (int x = 0; x < m; x++)
        {
            long res = 1L;
            for (int i = 0; i < n; i++)
                res = (res * x) % m;

            if (res == y)
            {
                System.out.print(x + " ");
                found = true;
            }
        }

        if (!found)
        {
            System.out.println(-1);
        }
    }
}
