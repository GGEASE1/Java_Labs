package Lab1;

import java.util.Scanner;

public class Ex18
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int First = in.nextInt();
        System.out.print("Введите второе число: ");
        int Second = in.nextInt();

        System.out.printf("Сумма: %s\n",First+Second);
        in.close();
    }

}
