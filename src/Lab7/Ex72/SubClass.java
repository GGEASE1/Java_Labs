package Lab7.Ex72;

public class SubClass extends SuperClass
{
    int int1;
    private String str2;

    SubClass(String strEx, int int1)
    {
        super(strEx);
        this.int1 = int1;
    }

    public void setFields()
    {
        super.setFields("БАЗА");
        this.int1 = 0;
    }

    public void setFields(String str1)
    {
        super.setFields(str1);
    }

    public void setFields(String str1, int int1)
    {
        super.setFields(str1);
        this.int1 = int1;
    }
}
