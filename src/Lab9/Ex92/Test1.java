package Lab9.Ex92;

import java.util.*;

public class Test1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.println("Двоичное представление числа: " + toBinary(number));
    }

    public static String toBinary(int number)
    {
        if (number == 0)
        {
            return "0";
        }
        if (number == 1)
        {
            return "1";
        }
        return toBinary(number / 2) + (number % 2);
    }
}
