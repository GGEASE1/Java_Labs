package Lab1;

import java.util.Scanner;

public class Ex12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Имя:");
        String Name = in.nextLine();

        System.out.println("Введите возраст:");
        int Age = in.nextInt();

        System.out.printf("%s,%s", Name, Age);
        in.close();
    }

}
