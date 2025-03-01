package Lab9.Ex99;

import java.util.*;

public class Main
{
    private static final Random random = new Random();

    public static void main(String[] args)
    {
        ArrayDeque<Integer> ArrayDeque = new ArrayDeque<>();
        ArrayList<Integer> ArrayList = new ArrayList<>();
        TreeSet<Integer> TreeSet = new TreeSet<>();

        for (int i = 0; i < 9000000; i++)
        {
            int value = random.nextInt();
            ArrayDeque.add(value);
            ArrayList.add(value);
            TreeSet.add(value);
        }

        measureAddFirst(ArrayDeque);
        measureAddFirst(ArrayList);
        measureAddFirst(TreeSet);

        measureAddMiddle(ArrayList);

        measureAddLast(ArrayDeque);
        measureAddLast(ArrayList);
        measureAddLast(TreeSet);

        measureRemoveFirst(ArrayDeque);
        measureRemoveFirst(ArrayList);

        measureRemoveMiddle(ArrayList);

        measureRemoveLast(ArrayDeque);
        measureRemoveLast(ArrayList);

        measureGetByIndex(ArrayList);
    }

    private static void measureAddFirst(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        collection.add(0);
        long endTime = System.nanoTime();
        System.out.println("Добавление элемента в начало " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureAddLast(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        collection.add(random.nextInt());
        long endTime = System.nanoTime();
        System.out.println("Добавление элемента в конец " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureAddMiddle(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        ((List<Integer>) collection).add(9000000 / 2, random.nextInt());
        long endTime = System.nanoTime();
        System.out.println("Добавление элемента в середину " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureRemoveFirst(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        if (collection instanceof Deque || collection instanceof List)
        {
            if (collection instanceof Deque)
            {
                ((Deque<Integer>) collection).removeFirst();
            }
            else
            {
                ((List<Integer>) collection).remove(0);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Удаление элемента в начале " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureRemoveLast(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        if (collection instanceof Deque || collection instanceof List)
        {
            if (collection instanceof Deque)
            {
                ((Deque<Integer>) collection).removeLast();
            }
            else
            {
                ((List<Integer>) collection).remove(collection.size() - 1);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Удаление элемента в конце " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureRemoveMiddle(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        ((List<Integer>) collection).remove(9000000 / 2);
        long endTime = System.nanoTime();
        System.out.println("Удаление элемента в середине " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }

    private static void measureGetByIndex(Collection<Integer> collection)
    {
        long startTime = System.nanoTime();
        ((List<Integer>) collection).get(9000000 / 2);
        long endTime = System.nanoTime();
        System.out.println("Получение элемента по индексу " + collection.getClass().getSimpleName() + ": " + (endTime - startTime) + " ns");
    }
}