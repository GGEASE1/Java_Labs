package timus_2;

import java.io.*;

public class task1196
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        int[] profDates = new int[N];
        for (int i = 0; i < N; i++)
        {
            profDates[i] = Integer.parseInt(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());
        int matches = 0;
        for (int i = 0; i < M; i++)
        {
            int date = Integer.parseInt(br.readLine());
            if (binarySearch(profDates, date))
            {
                matches++;
            }
        }

        pw.println(matches);
        pw.close();
    }

    private static boolean binarySearch(int[] arr, int key)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int mid = (l + r) >>> 1;
            if (arr[mid] < key) l = mid + 1;
            else if (arr[mid] > key) r = mid - 1;
            else return true;
        }
        return false;
    }
}
