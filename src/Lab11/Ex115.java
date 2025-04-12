package Lab11;

import java.util.List;

public class Ex115
{
    public static void main(String[] args)
    {
        String subsstring = "книг";
        List<String> strings = List.of(
                "В книгах есть много жанров.",
                "Существуют методы для создания книг.",
                "Многие авторы пишут романы.",
                "Книга может быть записана на носителях.",
                "Книжные фестивали проходят в разных странах.",
                "Книги могут иметь разные сферы.",
                "Циклы книг выпускаются раз в год.",
                "Произведения влияет на культуру общества."
        );

        System.out.println("Поиск подстроки: " + subsstring);
        System.out.println("В строках:");
        strings.forEach(System.out::println);

        System.out.println();
        System.out.println("Найдены строки:");
        List<String> found_strings = findSubstring(subsstring, strings);
        found_strings.forEach(System.out::println);
    }

    public static List<String> findSubstring(String substring, List<String> list)
    {
        return list.stream().filter(s -> s.toLowerCase()
                .contains(substring.toLowerCase()))
                .toList();
    }
}
