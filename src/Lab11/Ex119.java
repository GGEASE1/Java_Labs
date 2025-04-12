package Lab11;

import java.util.List;

public class Ex119
{
    public static void main(String[] args)
    {
        List<String> strings = List.of(
                "Статья228",
                "Программа", "Дом2", "Массивы",
                "$доллар", "Цикл", "%Скидки%",
                "Класс1209", "МашинаI8", "Объект#1023",
                "Скрипт101", "Ошибка404", "Интерпретатор",
                "Зачем", "Модуль101", "Здесь"
        );

        System.out.println("Исходный список строк:");
        strings.forEach(System.out::println);

        System.out.println();

        System.out.println("Строки состоящие только из букв:");
        List<String> onlyLetters = findOnlyLetters(strings);
        onlyLetters.forEach(System.out::println);
    }

    public static List<String> findOnlyLetters(List<String> list)
    {
        return  list.stream().filter(s->{char[] a = s.toCharArray();
            for(Character c: a)
                if(!Character.isLetter(c))
                    return false;
                    return true;}
                ).toList();
    }
}
