package timus_1;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1820
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int need_steaks = in.nextInt();
        int max_steaks = in.nextInt();
        if (max_steaks >= need_steaks)
        {
            out.print(2);
        }
        else
        {
            if ((need_steaks * 2) % max_steaks == 0)
            {
                out.print((need_steaks * 2) / max_steaks);
            }
            else
            {
                out.print((need_steaks * 2) / max_steaks +1);
            }
        }
        out.flush();
    }
}