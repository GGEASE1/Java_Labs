package timus_2;

import java.util.*;
import java.util.stream.Collectors;

public class task2023
{

    private static final Map<Integer, List<String>> boxes = new HashMap<>();

    static
    {
        boxes.put(1, Collections.unmodifiableList(Arrays.asList(
                "Alice", "Ariel", "Aurora",
                "Phil", "Peter", "Olaf",
                "Phoebus", "Ralph", "Robin"
        )));
        boxes.put(2, Collections.unmodifiableList(Arrays.asList(
                "Bambi", "Belle", "Bolt",
                "Mulan", "Mowgli", "Mickey",
                "Silver", "Simba", "Stitch"
        )));
        boxes.put(3,Collections.unmodifiableList(Arrays.asList(
                "Dumbo", "Genie", "Jiminy",
                "Kuzko", "Kida", "Kenai",
                "Tarzan", "Tiana", "Winnie"
        )));
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        int current_box = 1;
        int count_steps = 0;
        for(int i=0; i<N; i++)
        {
            String adress = in.nextLine();
            int new_box = boxes.entrySet().stream()
                    .filter(e->e.getValue().contains(adress))
                    .collect(Collectors.toList()).get(0).getKey();
            count_steps += Math.abs(new_box - current_box);
            current_box = new_box;
        }
        System.out.println(count_steps);
    }
}
