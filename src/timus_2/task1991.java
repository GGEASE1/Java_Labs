package timus_2;

import java.util.Scanner;

public class task1991
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        long remainingBalls = 0;
        long survivingDroids = 0;

        for(int i = 0; i < n; ++i)
        {
            long ballsInCart = in.nextLong();

            if(ballsInCart <= k)
            {
                survivingDroids += (k - ballsInCart);
            }
            else
            {
                remainingBalls += (ballsInCart - k);
            }
        }
        System.out.println(remainingBalls + " " + survivingDroids);
    }
}