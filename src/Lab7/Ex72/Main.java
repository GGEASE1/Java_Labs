package Lab7.Ex72;

public class Main
{
    public static void main(String[] args)
    {
        //Супер класс
        SuperClass superClassObject =
                new SuperClass("Слово один");
        System.out.println("Длина = " + superClassObject.getLengthStr1());

        superClassObject.setFields("Слово два");
        System.out.println("Длина = " + superClassObject.getLengthStr1());

        //Суб класс
        SubClass subClassObject =
                new SubClass("Слово три", 4);
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());

        subClassObject.setFields("Слово четыре");
        System.out.println("Перегрузка с 1 аргументом:");
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());

        subClassObject.setFields("Слово пять", 8);
        System.out.println("Перегрузка с 2 аргументами:");
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());

        System.out.println("Перегрузка с без аргументов:");
        subClassObject.setFields();
        System.out.println("Подкласс int 1 = " + subClassObject.int1);
        System.out.println("Длинна str1 = " + subClassObject.getLengthStr1());
    }
}
