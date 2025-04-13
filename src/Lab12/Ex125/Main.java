package Lab12.Ex125;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int N = input.nextInt();
        int[] numbers = new int[N];

        for(int i =0; i<N; i++)
        {
            numbers[i] = random.nextInt(100000);
        }

        long startTime = System.currentTimeMillis();
        int max = find.Max(numbers);
        long endTime = System.currentTimeMillis();

        System.out.println("Максимальное значение в массиве: " + max);
        System.out.println("Время выполнения: " + (endTime - startTime) + " мс");
    }

}
