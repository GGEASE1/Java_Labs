package timus_2;

import java.util.*;

public class task1545
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] hieroglyphs = new String[N];

        for(int i = 0; i < N; i++)
        {
            hieroglyphs[i] = scanner.nextLine();
        }

        char firstLetter = scanner.nextLine().charAt(0);

        for(String h : hieroglyphs)
        {
            if(h.charAt(0) == firstLetter)
            {
                System.out.println(h);
            }
        }
    }
}
