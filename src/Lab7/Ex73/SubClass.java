package Lab7.Ex73;

public class SubClass extends SuperClass
{
    char chr1;

    SubClass(int intEx, char chr1Ex)
    {
        super(intEx);
        this.chr1 = chr1Ex;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "chr 1 = " + this.chr1;
        return superClassNameAndFieldValue;
    }
}
