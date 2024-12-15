package Lab2;

import java.util.Scanner;

public class Ex25
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int result = 0;
        int four_number = 0;
        result = number / 1000;
        four_number = number % 10;
        System.out.printf("Тысяч: %d \n", result);
        System.out.printf("4 цифра с права: %d \n", four_number);
    }
}
