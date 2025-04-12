package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Ex114
{
    public static void main(String[] args)
    {
        List<Integer> Num = new ArrayList<>();
        int N = 10;
        for (int i = 1; i <= N; i++)
        {
            Num.add(i);
        }

        System.out.println("Исходный список:");
        Num.forEach(e-> {System.out.print(e + " ");});

        System.out.println();
        System.out.println("Квадраты чисел:");

        List<Integer> squares = toSquare(Num);
        squares.forEach(n->{System.out.print(n + " ");});
        System.out.println();
    }
    public static List<Integer> toSquare (List<Integer> Num)
    {
        return Num.stream().map(n->{int r = n*n; return r;}).toList();
    }
}
