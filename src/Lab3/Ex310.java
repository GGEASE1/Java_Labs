package Lab3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Ex310
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите длинну массива: ");
        int length_array = in.nextInt();
        Integer[] array = new Integer[length_array];
        for (int i = 0; i < length_array; i++)
        {
            array[i] = random.nextInt(100);
            System.out.printf("%d, ", array[i]);
        }
        ElementArray.DecreasingArray(array);
    }

    static class ElementArray
    {
        static void DecreasingArray (Integer[] array)
        {
            Arrays.sort(array, Collections.reverseOrder());
            System.out.println("\nМассив по убыванию");
            for (Integer number: array) {
                System.out.printf("%d, ", number);
            }
        }
    }
}
