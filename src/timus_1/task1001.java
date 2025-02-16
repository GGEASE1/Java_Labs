package timus_1;

import java.util.Scanner;

public class task1001
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (in.hasNext())
        {
            sb.append(in.next());
            sb.append(' ');
        }

        String[] nums = sb.toString().trim().split("\\s+");

        for (int i = nums.length - 1; i >= 0; i--)
        {
            double d = Double.parseDouble(nums[i]);
            System.out.printf("%.4f%n", Math.sqrt(d));
        }
    }
}