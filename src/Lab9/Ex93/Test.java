package Lab9.Ex93;

import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        writeArray(array, 0);

        printArray(array, 0);
    }

    public static void writeArray(int[] array, int index)
    {
        if (index >= array.length) return;

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите элемент массива [%d]: ", index);
        array[index] = in.nextInt();

        writeArray(array, index + 1);
    }

    public static void printArray(int[] array, int index)
    {
        if (index >= array.length)
        {
            System.out.println();
            return;
        }
        System.out.print(array[index] + " ");
        printArray(array, index + 1);
    }
}
