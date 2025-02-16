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

            // Массив для хранения достижимых сумм
            boolean[] reachableSums = new boolean[maxPossibleSum + 1];
            reachableSums[0] = true;

            for (int weight : weights)
            {
                for (int j = maxPossibleSum; j >= weight; j--)
                {
                    reachableSums[j] = reachableSums[j] || reachableSums[j - weight];
                }
            }

            // Находим максимальный достижимый вес для одной кучи
            int maxAchievableSum = 0;
            for (int sum = maxPossibleSum; sum >= 0; sum--)
            {
                if (reachableSums[sum])
                {
                    maxAchievableSum = sum;
                    break;
                }
            }

            // Разница между двумя кучами
            System.out.println(totalWeight - 2 * maxAchievableSum);
        }
}
