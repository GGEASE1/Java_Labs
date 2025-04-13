package Lab12.Ex126;

public class math
{
    public static int Sum(int[] numbers)
    {
        int numThreads = 6; // Используем 6 потоков независимо от количества ядер
        int chunkSize = numbers.length / numThreads;

        Thread[] threads = new Thread[numThreads];
        int[] results = new int[numThreads]; // Массив для хранения локальных сумм

        for (int i = 0; i < numThreads; i++)
        {
            final int startIndex = i * chunkSize;
            final int endIndex = (i == numThreads - 1) ? numbers.length : (startIndex + chunkSize);

            int finalI = i;
            threads[i] = new Thread(() -> {
                results[finalI] = calculateSumInRange(numbers, startIndex, endIndex);
            });
            threads[i].start(); // Запуск потока
        }
        try
        {
            for (Thread thread : threads)
            {
                thread.join(); // Ожидание завершения всех потоков
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        int totalSum = 0;
        for (int result : results)
        {
            totalSum += result;
        }
        return totalSum;
    }

    private static int calculateSumInRange(int[] numbers, int startIndex, int endIndex)
    {
        int sum = 0;
        for (int i = startIndex; i < endIndex; i++)
        {
            sum += numbers[i];
        }
        return sum;
    }
}
