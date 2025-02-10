package Lab7.Ex73;

public class SubSubClass extends SubClass
{
    String str1;

    SubSubClass(int intEx, char chr1Ex, String str1Ex)
    {
        super(intEx, chr1Ex);
        this.str1 = str1Ex;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "int 1 = " + this.int1 + "\n" +
                "chr 1 = " + this.chr1 + "\n" +
                "str 1 = " + this.str1;
        return superClassNameAndFieldValue;
    }


}
