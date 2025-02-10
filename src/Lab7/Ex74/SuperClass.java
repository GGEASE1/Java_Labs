package Lab7.Ex74;

public class SuperClass
{
    char chr1;

    SuperClass(char chrEx)
    {
        this.chr1 = chrEx;
    }
    SuperClass(SuperClass obj)
    {
        this.chr1 = obj.chr1;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "chr 1 = " + this.chr1;
        return superClassNameAndFieldValue;
    }
}
