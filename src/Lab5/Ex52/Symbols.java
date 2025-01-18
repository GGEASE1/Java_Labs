package Lab5.Ex52;

public class Symbols
{
    public char Char1, Char2;

    public void printBetweenSymbols(char Char1, char Char2)
    {
        this.Char1 = Char1;
        this.Char2 = Char2;

        int code_Char1 = Char1;

        while (code_Char1 <= (int)Char2)
        {
            System.out.printf("Символ: %c, код: %d\n", (char) code_Char1, code_Char1);
            code_Char1++;
        }

    }

}
