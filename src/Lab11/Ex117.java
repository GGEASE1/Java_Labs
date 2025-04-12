package Lab11;

import java.util.List;

public class Ex117
{
    public static void main(String[] args)
    {
        int min_length = 20;
        List<String> strings = List.of(
                "Машина может ехать.",
                "Все благодоря научному прогрессу.",
                "Используется ДВС.",
                "Вместо лошадей сложный механизм.",
                "Который впервые придумали в начале 20 века.",
                "Сейчас это обыденное средство передвижения.",
                "Машиной никого не удивить.",
                "Разве что маркой.",
                "Такоими как.",
                "BMW.",
                "Mercedes.",
                "Audi.",
                "RollsRoyce.",
                "Dodge.",
                "Man."
        );

        System.out.println("Исходный список:");
        strings.forEach(System.out::println);
        System.out.println();

        List<String> found_strings = findLengthMoreThen(min_length, strings);
        System.out.println("Строки длинной больше " + min_length + ":");
        found_strings.forEach(System.out::println);
    }

    public static List<String> findLengthMoreThen(int length, List<String> list)
    {
        return list.stream().filter(s->s.length()>length).toList();
    }

}
