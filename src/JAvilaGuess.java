import java.util.Scanner;

public class JAvilaGuess
{
    public static void main(String[] args)
    {
        systemGuess();
    }

    private static void systemGuess()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = input.next();
        System.out.println("Think of a number between 1-100, " + name + ". When you are ready, type \"ready\".");
        int guesser = 50;
        if (input.next().equals("ready"))
            System.out.println("Tell me, " + name + ", is it higher, lower, or equal to " + guesser + "?");
        String a = input.next();
        while (!(a.equals("equal")))
        {
            if (a.equals("higher"))
            {
                a = input.next();
                guesser += (100 - guesser)/2;
                System.out.println("Tell me, " + name + ", is it higher, lower, or equal to " + guesser + "?");
                a = "";
            }
            if (a.equals("lower"))
            {
                a = input.next();
                guesser -= (100 - guesser)/2;
                System.out.println("Tell me, " + name + ", is it higher, lower, or equal to " + guesser + "?");
                a = "";
            }
        }
        System.out.println(name + "'s number is " + guesser + ".");
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
