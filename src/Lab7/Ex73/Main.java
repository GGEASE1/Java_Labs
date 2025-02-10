package Lab7.Ex73;

public class Main
{
    public static void main(String[] args)
    {
        SuperClass superClassObject =
                new SuperClass(10);
        String className = superClassObject.toString();
        System.out.println(className);

        SubClass subClassObject =
                new SubClass(10, 'f');
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SubClass subSubClassObject =
                new SubSubClass(10, 'f', "thtf");
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);
    }
}
