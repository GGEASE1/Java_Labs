package Lab7.Ex72;

public class SuperClass
{
    private String str1;

    SuperClass(String strEx)
    {
        this.str1 = strEx;
    }

    public void setFields(String str1)
    {
        this.str1 = str1;
    }

    public Integer getLengthStr1()
    {
        return this.str1.length();
    }
}

