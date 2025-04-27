package timus_2;

import java.util.Scanner;

public class task1493
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ticketNumber = in.next();

        int n = Integer.parseInt(ticketNumber);

        boolean prevHappy = isHappy(n - 1);
        boolean nextHappy = isHappy(n + 1);

        if (prevHappy || nextHappy)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    private static boolean isHappy(int number)
    {
        String s = String.format("%06d", number);

        char[] digits = s.toCharArray();

        int sumFirstHalf = Character.getNumericValue(digits[0]) +
                Character.getNumericValue(digits[1]) +
                Character.getNumericValue(digits[2]);

        int sumSecondHalf = Character.getNumericValue(digits[3]) +
                Character.getNumericValue(digits[4]) +
                Character.getNumericValue(digits[5]);

        return sumFirstHalf == sumSecondHalf;
    }
}
