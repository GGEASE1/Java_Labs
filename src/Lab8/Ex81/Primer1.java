package Lab8.Ex81;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Primer1
{
    //Метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException
    {
        while (true)
        {
            int oneByte = in.read();
            if (oneByte != -1)
            {
                System.out.print((char) oneByte);
            }
            else
            {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        try
        {
            //С потоком связан файл
            InputStream inFile = new FileInputStream("MyFile1.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            //С потоком связана ссылка
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            //С потоком связан массив Byte
            InputStream inArray = new ByteArrayInputStream(new byte [] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }

        catch (IOException e)
        {
            System.out.println("Ошибка: " + e);
        }
    }
}
