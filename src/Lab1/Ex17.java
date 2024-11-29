package Lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex17
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int Age = in.nextInt();

        int NowYear = LocalDate.now().getYear();
        int BirthDay = NowYear - Age;

        System.out.printf("Ваш год рождения: %s\n", BirthDay);
        in.close();
    }

}
