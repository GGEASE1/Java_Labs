package Lab5.Ex53;

public class createObject
{
    public int num1,num2;

    public void setDontArguments()
    {
        System.out.println("Создание объекта без аргументов");
    }

    public void setOneArguments(int num1)
    {
        this.num1 = num1;
        System.out.printf("Создание объекта с аргументом: %d\n", this.num1);
    }

    public void setTwoArguments(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        System.out.printf("Создание объекта с двумя аргументами: 1)%d  2)%d\n", this.num1, this.num2);
    }

}
