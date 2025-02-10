package Lab7.Ex75;

public class Main
{
    public static void main(String[] args) {

        SuperClass superClassObject =
                new SuperClass("Hello");
        String className = superClassObject.toString();
        System.out.println(className);

        FirstSubClass subClassObject =
                new FirstSubClass("Friend", 5);
        String subClassName = subClassObject.toString();
        System.out.println(subClassName);

        SecondSubClass subSubClassObject =
                new SecondSubClass("Sunny", 'b');
        String subClassName2 = subSubClassObject.toString();
        System.out.println(subClassName2);
    }
}
