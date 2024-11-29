package Lab1;

import java.util.Scanner;

public class Ex19
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = in.nextInt();

        int firstNumber = number--;
        int secondNumber = number++;
        int thirdNumber = ++number;

        int sum = firstNumber + secondNumber + thirdNumber;
        int fourthNumber = sum * sum;

        System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber + ", " + fourthNumber);

        in.close();
    }

}
