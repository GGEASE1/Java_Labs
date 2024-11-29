package Lab1;

import java.util.Scanner;

public class Ex11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию:");
        String Su = in.nextLine();

        System.out.println("Введите Имя:");
        String Na = in.nextLine();

        System.out.println("Введите Отчество:");
        String SSu = in.nextLine();

        System.out.printf("Hello! \n%s \n%s \n%s", Su, Na, SSu);
        in.close();
    }

}