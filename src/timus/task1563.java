package timus;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class task1563
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> shops = new ArrayList<>();
        String line = in.nextLine();

        while (true)
        {
            if (in.hasNextLine())
            {
                line = in.nextLine().toLowerCase();
                shops.add(line);
            }
            else
            {
                break;
            }
        }
        Set<String> set_shops = new HashSet<>(shops);
        System.out.println(N - set_shops.size());
    }
}