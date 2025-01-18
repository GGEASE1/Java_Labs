package Lab5.Ex51;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Writetest test = new Writetest();

        test.gettext('a');//Тут вводим символ

        System.out.println(test.getcode());

        test.showall();
    }

}
