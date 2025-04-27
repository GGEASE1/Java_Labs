package timus_2;

import java.util.Scanner;
import java.util.ArrayList;

public class task1209
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Boolean> r = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            int index = in.nextInt();
            r.add(find_k(index));
        }
        for(Boolean e:r)
        {
            System.out.print((e ? 1 : 0) + " ");
        }
        System.out.println();
    }
    static boolean find_k(int n)
    {
        return (1+Math.sqrt(8*(double)n - 7))%2 == 0;
    }
}
