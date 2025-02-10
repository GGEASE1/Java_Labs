package Lab7.Ex74;

public class Main
{
    public static void main(String[] args)
    {
        SuperClass superObject =
                new SuperClass('Z');

        SubClass subObject =
                new SubClass('O', "Zdarova");

        SubSubClass subSubObject =
                new SubSubClass('V', "Stalker", 2);

        SuperClass superClassObject =
                new SuperClass(superObject);
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject =
                new SubClass(subObject);
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubClass subSubClassObject =
                new SubSubClass(subSubObject);
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);
    }
}
