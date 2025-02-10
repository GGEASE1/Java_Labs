package Lab7.Ex71;

public class SubClass extends SuperClass
{
    private String str2;
    private String str3;

    SubClass(String strEx)
    {
        super(strEx);
    }

    SubClass(String strEx2, String strEx3)
    {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    @Override
    public String toString()
    {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.getStr1() + "\n" +
                "str 2 = " + this.str2 + "\n" +
                "str 3 = " + this.str3 ;
        return ClassNameAndFieldValue;
    }

}
