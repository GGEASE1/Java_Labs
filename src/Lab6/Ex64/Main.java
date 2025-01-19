package Lab6.Ex64;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();

        Lab6.Ex65.Test test = new Lab6.Ex65.Test();
        Test.doubleFactorial(number);
    }
}
