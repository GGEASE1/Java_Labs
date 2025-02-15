package Lab7.Ex74;

public class SubClass extends SuperClass
{
    String str1;

    SubClass(char chrEx, String strEx)
    {
        super(chrEx);
        this.str1 = strEx;
    }

    SubClass(SubClass obj)
    {
        super(obj);
        this.str1 = obj.str1;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "str 1 = " + this.str1;
        return superClassNameAndFieldValue;
    }
}
