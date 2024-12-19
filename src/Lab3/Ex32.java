package Lab3;

import java.util.Scanner;

public class Ex32
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = in.nextLine();

        switch (day)
        {
            case "Понедельник" -> System.out.println(1);
            case "Вторник" -> System.out.println(2);
            case "Среда" -> System.out.println(3);
            case "Четверг" -> System.out.println(4);
            case "Пятница" -> System.out.println(5);
            case "Суббота" -> System.out.println(6);
            case "Воскресенье" -> System.out.println(7);
            default -> System.out.println("Такого дня нет");
        }

        // if (day.equals("Понедельник"))
        // {
        // System.out.println(1);
        // }
        // else if (day.equals("Вторник"))
        // {
        // System.out.println(2);
        // }
        // else if (day.equals("Среда"))
        // {
        // System.out.println(3);
        // }
        // else if (day.equals("Четверг"))
        // {
        // System.out.println(4);
        // }
        // else if (day.equals("Пятница"))
        // {
        // System.out.println(5);
        // }
        // else if (day.equals("Суббота"))
        // {
        // System.out.println(6);
        // }
        // else if (day.equals("Воскресенье")) {
        // System.out.println(7);
        // }
        // else
        // {
        // System.out.println("Такого дня нет");
        // }
    }
}
