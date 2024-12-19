package Lab4;

public class Ex44
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
                arr[i][j] = 3;
            }
        }
        for (int i=0; i < heigth; i++)
        {
            for (int j = 0; i >= j; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
