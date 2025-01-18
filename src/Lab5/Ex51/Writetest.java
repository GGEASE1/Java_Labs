package Lab5.Ex51;

public class Writetest
{
    private char text;

    public void gettext(char text)
    {
        this.text = text;
    }

    public int getcode()
    {
        return text;
    }

    public void showall()
    {
        System.out.print(text);
        System.out.println((int)text);
    }
}
