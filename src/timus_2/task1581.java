package timus_2;

import java.util.Scanner;

public class task1581
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] digits = new int[N];
        for(int i=0; i<N; i++)
        {
            digits[i] = in.nextInt();
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; )
        {
            int count = 1;
            while (i + 1 < N && digits[i] == digits[i + 1])
            {
                count++;
                i++;
            }
            answer.append(count).append(" ")
                    .append(digits[i]).append(" ");
            i++;
        }
        System.out.println(answer.toString().trim());
    }
}
