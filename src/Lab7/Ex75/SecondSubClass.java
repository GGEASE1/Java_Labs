package Lab7.Ex75;

public class SecondSubClass extends SuperClass
{
    protected char chr1;

    SecondSubClass(String strEx, char chrEx)
    {
        super(strEx);
        this.chr1 = chrEx;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "super String = " + super.toString();
        return superClassNameAndFieldValue;
    }
}
