package Lab1;

import java.util.Scanner;

public class Ex14
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String monthName = in.nextLine().trim();

        System.out.print("Введите количество дней в этом месяце: ");
        int daysInMonth = in.nextInt();

        String message = String.format("Месяц %s содержит %d дней.", monthName, daysInMonth);
        System.out.println(message);

        in.close();
    }

}
