package Lab13.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1323
{

    public static void main(String[] args)
    {
        System.out.println("Введите размер массива <=127: ");
        Scanner input = new Scanner(System.in);
        byte N = input.nextByte();
        try
        {
            byte sum = calculateSum(N);
            System.out.println("Сумма: " + sum);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Не корректный ввод, не byte");
        }
        catch (IllegalArgumentException | ByteOverflowException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static byte calculateSum(byte N) throws ByteOverflowException
    {
        byte[] array = getArray(N);
        byte sum = 0;
        for (byte b : array)
        {
            sum += b;
        }
        if(sum <0)
        {
            throw new ByteOverflowException("Значение переполняет тип byte!");
        }
        return sum;
    }

    public static byte[] getArray(byte N)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        byte[] result = new byte[N];
        for(byte i=0; i<N; i++)
        {
            byte num = input.nextByte();
            if(num<0)
            {
                throw new IllegalArgumentException("Элементы массива не должны быть отрицательны!");
            }
            result[i] = num;
        }
        return result;
    }

    public static class ByteOverflowException extends Exception
    {
        public ByteOverflowException(String message)
        {
            super(message);
        }
    }
}


