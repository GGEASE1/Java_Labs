package Lab2;

import java.util.Scanner;

public class Ex22
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        if (number % 5 == 2 && number % 7 == 1)
        {
            System.out.println("Число удовлетворяет требованиям");
        }
        else
        {
            System.out.println("Число не удовлетворяет требованиям");
        }

    }

}
