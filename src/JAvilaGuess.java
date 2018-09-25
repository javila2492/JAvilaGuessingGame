import java.util.Scanner;

public class JAvilaGuess
{
    public static void main(String[] args)
    {
        youGuess(String[] args);
        systemGuess(String[] args);
    }
    public static void youGuess(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rand = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 1 and 10...");
        int guess = input.nextInt();
        while (!(guess == rand)) {
            System.out.println("Incorrect");
            System.out.println("I am thinking of a number between 1 and 10...");
            guess = input.nextInt();
        }
        System.out.println("Good job.");
    }

    public static void systemGuess(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1-100. When you are ready, type \"ready\".");
        int guesser = 50;
        if (input.equals("ready"))
            System.out.println("Is it higher, lower, or equal to " + guesser + "?");
        while (!(input.equals("correct"))) {
            if (input.equals("higher")) ;
            {
                guesser += (guesser / 2);
                System.out.println("Is it higher, lower, or equal to " + guesser + "?");
            }
            if (input.equals("lower")) ;
            {
                guesser -= (guesser / 2);
                System.out.println("Is it higher, lower, or equal to " + guesser + "?");
            }
        }
        guesser += (guesser / 2);
        System.out.println("Your number is " + guesser + ".");
    }
}
