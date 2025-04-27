package timus_2;

import java.io.*;
import java.util.*;

public class task1100
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(line[0]);
            arr[i][1] = Integer.parseInt(line[1]);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        for (int[] row : arr)
        {
            out.println(row[0] + " " + row[1]);
        }
        out.flush();
    }
}
