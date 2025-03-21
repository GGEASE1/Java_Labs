package Lab1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex15
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birthYear, 1, 1);

        Period period = Period.between(birthday, today);
        int age = period.getYears();

        System.out.printf("Ваш возраст: %d\n", age);
        in.close();
    }

}
