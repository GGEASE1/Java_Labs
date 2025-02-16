package timus;

import java.util.Scanner;

public class task2056
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int Count = in.nextInt(); // Количество экзаменов
        double sumGrades = 0.0;
        boolean FivesOnly = true;

        for (int i = 0; i < Count; i++)
        {
            int grade = in.nextInt();

            if (grade == 3) // Проверка наличия троек
            {
                System.out.println("None");
                return;
            }

            if (grade != 5) // Проверка, чтобы все были пятерками
            {
                FivesOnly = false;
            }
            sumGrades += grade;
        }

        double averageGrade = sumGrades / Count;

        if (FivesOnly)
        {
            System.out.println("Named");// Все оценки - пятерки
        }
        else if (averageGrade >= 4.5)
        {
            System.out.println("High");// Повышенная стипендия
        }
        else
        {
            System.out.println("Common");// Обычная стипендия
        }
    }
}
