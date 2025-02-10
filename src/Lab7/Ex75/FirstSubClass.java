package Lab7.Ex75;

public class FirstSubClass extends SuperClass
{
    protected int int1;

    FirstSubClass(String strEx, int intEx)
    {
        super(strEx);
        this.int1 = intEx;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "super String: \n" + super.toString();
        return superClassNameAndFieldValue;
    }
}
