import java.util.Scanner;

public class JAvilaGuess
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome. Please, choose which game you'd like to play. Type either \"you\" or \"I\"");
        String d = input.next();
        if (d.equals("you"))
            systemGuess();
        else
        {
            if (d.equals("I"))
                youGuess();
            else
                System.out.println("That wasn't an option, idiot.");
        }
        System.out.println("That was fun. You humans are so predictable.");
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
        String a = "";
        int b = 0;
        int hold = 50;
        while (b != 1)
        {
            a = input.next();
            if (a.equals("higher"))
            {
                hold = hold/2;
                guesser += hold;
                if (guesser > 100)
                    guesser = 100;
                System.out.println("Tell me, " + name + ", is it higher, lower, or equal to " + guesser + "?");
            }
            if (a.equals("lower"))
            {
                hold = hold/2;
                guesser -= hold;
                if (guesser < 1)
                    guesser = 1;
                System.out.println("Tell me, " + name + ", is it higher, lower, or equal to " + guesser + "?");
            }
            if (a.equals("equal"))
                b = 1;
        }
        System.out.println(name + "'s number is " + guesser + ".");
    }

    private static void youGuess()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = input.next();
        int rand = (int) (Math.random() * 10);
        System.out.println("I am thinking of a number between 1 and 10...");
        int guess = input.nextInt();
        while (!(guess == rand))
        {
            System.out.println(name + ", that is incorrect");
            System.out.println("I am thinking of a number between 1 and 10...");
            guess = input.nextInt();
        }
        System.out.println("Good job, " + name);
    }
}
