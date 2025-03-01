package Lab9.Ex95.Task1;

public class Head
{
    public static void main(String[] args)
    {
        Node head = null;
        for (int i = 0; i < 9; i++)
        {
            head = new Node(i, head);
        }

        Node ref = head;
        while (ref != null)
        {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
