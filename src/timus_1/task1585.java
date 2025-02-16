package timus_1;

import java.util.Scanner;

public class task1585
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // Количество записей в блокноте
        in.nextLine();  // Считывание оставшейся части строки после числа n

        int emperorCount = 0;
        int littleCount = 0;
        int macaroniCount = 0;

        for (int i = 0; i < n; i++)
        {
            String penguinType = in.nextLine();  // Вид пингвина

            switch (penguinType)
            {
                case "Emperor Penguin":
                    emperorCount++;
                    break;
                case "Little Penguin":
                    littleCount++;
                    break;
                case "Macaroni Penguin":
                    macaroniCount++;
                    break;
            }
        }

        if (emperorCount >= littleCount && emperorCount >= macaroniCount)
        {
            System.out.println("Emperor Penguin");
        }
        else if (littleCount >= emperorCount && littleCount >= macaroniCount)
        {
            System.out.println("Little Penguin");
        }
        else
        {
            System.out.println("Macaroni Penguin");
        }

        in.close();
    }
}
