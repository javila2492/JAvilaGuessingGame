import java.util.Scanner;

public class JAvilaGuess
{
    public static void main(String[] args)
    {
        youGuess();
        systemGuess();
    }

    private static void systemGuess()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Think of a number between 1-100. When you are ready, type \"ready\".");
        int guesser = 50;
        if (input.next().equals("ready"))
            System.out.println("Is it higher, lower, or equal to " + guesser + "?");
        while (!(input.next().equals("equal")))
        {
            if (input.next().equals("higher"))
            {
                guesser += (100 - guesser)/2;
                System.out.println("Is it higher, lower, or equal to " + guesser + "?");
            }
            if (input.next().equals("lower"))
            {
                guesser -= (100 - guesser)/2;
                System.out.println("Is it higher, lower, or equal to " + guesser + "?");
            }
        }
        System.out.println("Your number is " + guesser + ".");
    }

    private static void youGuess()
    {
        Scanner input = new Scanner(System.in);
        int rand = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 1 and 10...");
        int guess = input.nextInt();
        while (!(guess == rand))
        {
            System.out.println("Incorrect");
            System.out.println("I am thinking of a number between 1 and 10...");
            guess = input.nextInt();
        }
        System.out.println("Good job.");
    }
}
