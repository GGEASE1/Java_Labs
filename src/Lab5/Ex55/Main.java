package Lab5.Ex55;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        Test test = new Test();

        test.setNumber();
        test.setNumber(number);
        test.checkNumber();
    }
}