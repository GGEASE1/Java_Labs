package timus_2;

import java.math.BigInteger;
import java.util.Scanner;

public class task1243
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        BigInteger N = in.nextBigInteger();
        BigInteger result = N.mod(BigInteger.valueOf(7));

        System.out.println(result);
    }
}

