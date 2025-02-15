package timus;

import java.util.Scanner;

public class task2111
{
    public static void main(String[] args)
    {
        long Tax=0;//Налог
        long Weigth=0;//Вес

        Scanner in = new Scanner(System.in);
        int CityCount = in.nextInt();//Количество городов

        int[] Distance = new int[CityCount];
        for(int i = 0; i < CityCount; i++) //Расстояния по городам
        {
            Distance[i] = in.nextInt();
        }

        for(int Dist: Distance)//Суммарный вес
        {
            Weigth += Dist;
        }

        for(int i = 0; i < CityCount; i++)
        {
            Tax += Weigth*Distance[i]+ //Вес целиком на расстояние 1
                    (Distance[i]*(Weigth-Distance[i]));//Остаток веса на обратный путь
            Weigth -= Distance[i];//Стартовый вес уменьшился
        }
        System.out.println(Tax);
        in.close();
    }
}
