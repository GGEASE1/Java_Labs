package timus_1;

import java.util.Scanner;

public class task1005
{
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int[] weights = new int[n];

            for (int i = 0; i < n; i++)
            {
                weights[i] = in.nextInt();
            }
            in.close();

            // Суммарный вес всех камней
            int totalWeight = 0;
            for (int weight : weights)
            {
                totalWeight += weight;
            }

            // Максимально возможная сумма для одной кучи
            int maxPossibleSum = totalWeight / 2;

            boolean[][] dp = new boolean[n + 1][maxPossibleSum + 1];

            // Базовый случай: любая пустая кучка имеет сумму 0
            dp[0][0] = true;

            for (int i = 1; i <= n; i++)
            {
                int currentWeight = weights[i - 1];

                for (int j = 0; j <= maxPossibleSum; j++)
                {
                    if (j >= currentWeight)
                    {
                        dp[i][j] = dp[i - 1][j] || dp[i - 1][j - currentWeight];
                    }
                    else
                    {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }

            // Находим максимальный достижимый вес для одной кучи
            int maxAchievableSum = 0;
            for (int sum = maxPossibleSum; sum >= 0; sum--)
            {
                if (dp[n][sum])
                {
                    maxAchievableSum = sum;
                    break;
                }
            }

            // Разница между двумя кучами
            System.out.println(totalWeight - 2 * maxAchievableSum);
        }
}
