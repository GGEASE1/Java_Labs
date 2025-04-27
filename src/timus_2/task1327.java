package timus_2;

import java.util.Scanner;

public class task1327
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int startOdd = (A % 2 == 0 ? A + 1 : A);
        int endOdd = (B % 2 == 0 ? B - 1 : B);

        int count = (endOdd - startOdd) / 2 + 1;

        System.out.println(count);
    }
}
