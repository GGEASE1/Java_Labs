package Lab5.Ex51;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = in.next().charAt(0);

        Writetest test = new Writetest();

        test.gettext(symbol);//Тут вводим символ

        System.out.println(test.getcode());

        test.showall();
    }

}
