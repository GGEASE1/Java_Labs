package Lab12.Ex125;

import java.util.Arrays;

public class find
{
    public static int Max(int[] numbers)
    {
        int numThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = numbers.length / numThreads;

        Thread[] threads = new Thread[numThreads];
        int[] results = new int[numThreads];

        for (int i = 0; i < numThreads; i++)
        {
            final int startIndex = i * chunkSize;
            final int endIndex = (i == numThreads - 1) ? numbers.length : (startIndex + chunkSize);

            int finalI = i;
            threads[i] = new Thread(() -> {
                results[finalI] = findMaxInRange(numbers, startIndex, endIndex);
            });
            threads[i].start();
        }
        try
        {
            for (Thread thread : threads)
            {
                thread.join();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return Arrays.stream(results).max().getAsInt();
    }
    private static int findMaxInRange(int[] numbers, int startIndex, int endIndex)
    {
        int maxValue = Integer.MIN_VALUE;
        for (int i = startIndex; i < endIndex; i++)
        {
            maxValue = Math.max(maxValue, numbers[i]);
        }
        return maxValue;
    }
}
