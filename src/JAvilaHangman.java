import java.util.Scanner;

public class JAvilaHangman
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1, please enter a word.");
        boolean won = false;
        String word = input.next().toLowerCase();
        int guesses = 10;
        System.out.println("Player 2, step up. You have " +  guesses + " guesses. Do not disappoint me.");
        String blanks = "";
        for(int i = 0; i < word.length(); i++)
            blanks += " _";
        System.out.println(blanks);
        String b = input.next();
        int c = 0;
        while(won == false)
        {
            b = input.next().toLowerCase();
            if(b.length() > 1 && b.length() != word.length())
                System.out.println("You fool. either one letter at a time or a full word guess. No in between.");
            else
            {
                if (b.equals(word))
                {
                    won = true;
                    blanks = b;
                }
                else
                {
                    if (word.indexOf(b) > -1)
                    {
                        c = word.indexOf(b);
                        blanks = blanks.substring(0, c) + c + blanks.substring(c + 1);
                        System.out.println(blanks);
                        if (blanks.indexOf("_") == -1)
                            won = true;
                    } else
                      {
                        guesses--;
                        System.out.println("Wrong answer, idiot. You absolute bufoon. You have " + guesses + " left.");
                        if (guesses == 0)
                        {
                            System.out.println("You lost. You failed all your guesses and lost. Nice job idiot. Player 1 wins");
                            break;
                        }
                    }
                }
            }
        }
        if(won == true)
            System.out.println("Congratulations Player 2. The word was " + word + ". You got it with " + guesses + " guesses left.");
        else
            System.out.println("The word was " + word + ". Player 1 wins. Thanks for nothing Player 2");
    }
}
