package Lab4;

public class Ex43
{
    public static void main(String[] args)
    {
        int arr[][];
        int heigth = 5;
        int length = 5;
        arr = new int[heigth][length];
        for (int i=0; i < heigth; i++)
        {
            for (int j=0; j < length; j++)
            {
                arr[i][j] = 2;
            }
        }
        for (int i=0; i < heigth; i++)
        {
            for (int j = 0; j < length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
