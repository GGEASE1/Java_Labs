package Lab7.Ex73;

public class SuperClass
{
    int int1;

    SuperClass(int intEx)
    {
        this.int1 = intEx;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1;
        return superClassNameAndFieldValue;
    }
}
