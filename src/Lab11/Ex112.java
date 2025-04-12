package Lab11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex112
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массивов:");
        int N = input.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        Random random = new Random();
        for(int i =0; i<N; i++){
            a[i] = random.nextInt(50);
            b[i] = random.nextInt(50);
        }

        System.out.println("Исходные массиввы:");

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println("Пересечение массивов:");

        System.out.println(Arrays.toString(filterIntersectionFrom(a,b)));
    }

    public static int[] filterIntersectionFrom(int[] arr1, int[] arr2)
    {
        return Arrays.stream(arr1)
                .filter(e-> Arrays.stream(arr2).
                        anyMatch(e2->e2==e)).toArray();
    }
}
