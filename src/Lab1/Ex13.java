package Lab1;

import java.util.Scanner;

public class Ex13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текущий день недели: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Введите текущий месяц: ");
        String month = in.nextLine();

        System.out.print("Введите текущую дату: ");
        int date = in.nextInt();

        String message = String.format("%s, %d %s", dayOfWeek, date, month);
        System.out.println(message);

        in.close();
    }

}
