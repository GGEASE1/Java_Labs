package timus_2;

import java.util.*;

public class task1496
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());

        Set<String> accounts = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for(int i = 0; i < N; i++)
        {
            String account = in.nextLine().trim();
            if(!accounts.add(account))
            {
                duplicates.add(account);
            }
        }
        for(String acc : duplicates)
        {
            System.out.println(acc);
        }
    }
}