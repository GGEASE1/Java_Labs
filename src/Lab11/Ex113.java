package Lab11;

import java.util.List;

public class Ex113
{
    public static void main(String[] args)
    {
        String Text = "После холодной, суровой зимы все ждут весну. Кто\n" +
                "открывает весну?\n" +
                "Весну цветов открывает ранний первенец – мать – и –\n" +
                "мачеха. Этот золотой подснежник растёт на солнечных\n" +
                "глинистых склонах. Мать – и – мачеха распускается раньше\n" +
                "всех трав – до выставки ульев, до вылета первых пчёл, до\n" +
                "ледохода.\n" +
                "Цветёт этот чудесный цветок около двух месяцев.";

        List<String> list = List.of(Text.split(" "));
        System.out.println("\n"+"Строка после сплита: "+ "\n");
        list.forEach(System.out::println);

        List<String> onlyUpper  = onlyUpperCaseString(list);

        System.out.println("Строки только с большой буквы:");
        onlyUpper.forEach(System.out::println);
    }

    public static List<String> onlyUpperCaseString(List<String> list)
    {
        return list.stream()
                .filter(s ->
                        Character.isUpperCase(s.charAt(0))).toList();
    }
}
