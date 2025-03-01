package Lab9.Ex98;

public class Main
{
    public static void main(String[] args)
    {
        MyList listHead = new MyList();
        MyList listTail = new MyList();
        String[] values = {"911", "Mikhail", "Circle", "Vlad", "A4"};
        System.out.println("Заполение списка с головы:");
        listHead.createHead(values);
        System.out.println(listHead.toString());
        System.out.println("Заполение списка с хвоста:");
        listTail.createTail(values);
        System.out.println(listTail.toString());
        System.out.println("Добавление элемента в начало списка:");
        listHead.addFirst("What is love");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в конец списка:");
        listHead.addLast("GG");
        System.out.println(listHead.toString());
        System.out.println("Добавление элемента в указанное место списка:");
        listHead.insert(4, "Nikon");
        System.out.println(listHead.toString());
        System.out.println("Удаление первого элемента из списка:");
        listHead.removeFirst();
        System.out.println(listHead.toString());
        System.out.println("Удаление последнего элемента из списка:");
        listHead.removeLast();
        System.out.println(listHead.toString());
        System.out.println("Удаление элемента по индексу из списка:");
        listHead.remove(2);
        System.out.println(listHead.toString());
        MyList listHeadRec = new MyList();

        System.out.println("Заполение списка с головы c помощью рекурсии:");
        listHeadRec.createHeadRec(values);
        System.out.println(listHeadRec.toString());
        MyList listTailRec = new MyList();
        System.out.println("Заполение списка с хвоста с помощью рекурсии:");
        listTailRec.createTailRec(values);
        System.out.println(listTailRec.toString());
        System.out.println("Вывод списка с помощью рекурсии:");
        System.out.println(listTailRec.toStringRec());
    }
}
