package Lab7.Ex75;

public class SuperClass
{
    private String str1;

    SuperClass(String strEx)
    {
        this.str1 = strEx;
    }

    @Override
    public String toString()
    {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.str1 + "\n" +
                "-----------------------------";
        return superClassNameAndFieldValue;
    }
}
