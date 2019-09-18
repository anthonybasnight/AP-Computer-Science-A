import java.util.Scanner;

public class Classwork5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Exercise 1
        
        System.out.println("Random Dice Roller");
        
        for (int i = 0; i < 5; i += 1)
        {
            double num = (int)(Math.random() * 6);
            System.out.println("You just rolled a " + (num + 1));
        }
        
        // Exercise 2
        
        System.out.println(" ");
        System.out.println(" Roll a sum of 7 or 11 but not 2, 3, or 12");
        
        for (int j = 0; j < 5; j += 1)
        {
            double num = (int)(Math.random() * 6) + 1;
            double num2 = (int)(Math.random() * 6) + 1;
            if (num + num2 == 7 || num + num2 == 11)
                System.out.println("You rolled a " + (num + num2) + ". You win!");
            else if (num + num2 == 2 || num + num2 == 3 || num + num2 == 12)
                System.out.println("You rolled a " + (num + num2) + ". You lose!");
            else
                System.out.println("You rolled a " + (num + num2) + ". Try again!");
        }
        
        // Exercise 3
        
        System.out.println(" ");
        System.out.println(" Magic 8 Ball");
        System.out.println("Ask me a question:");
        String input = scan.nextLine();
        
        double num = (int)(Math.random() * 8) + 1;
        if (num == 1)
            System.out.println("The world may never know...");
        else if (num == 2)
            System.out.println("idk lol");
        else if (num == 3)
            System.out.println("You bet you Angle Side Side Congruence Theorem");
        else if (num == 4)
            System.out.println("Um excuse you, I'm on my break you ignorant prick");
        else if (num == 5)
            System.out.println("Imma be honest wit ya idk much except you gonna be uglyyy");
        else if (num == 6)
            System.out.println("They're after me Lucky Charms");
        else if (num == 7)
            System.out.println("idk im iliterit");
        else
            System.out.println("I have crippling depression :/");
        
        // Exercise 4
        
        System.out.println(" ");
        System.out.println(" Custom Dice Roll");
        System.out.println("How many sides do you want to have on your dice?");
        int sides = scan.nextInt();
        double roll = (int)(Math.random() * sides) + 1;
        
        if (roll < 1)
            System.out.println("Invalid Entry :/");
        else 
            System.out.println("You rolled a " + roll);
        
        // Exercise 5
        
        System.out.println(" ");
        System.out.println(" I'm thinking of a number between 1 and 10...");
        System.out.println("Take a guess:");
        
        int guess = scan.nextInt();
        double guess2 = (double)guess;
        double num3 = (int)(Math.random() * 10) + 1;
        if (guess2 == num3)
            System.out.println("Bingo! My number was " + num3);
        else
            System.out.println("Nope! My number was " + num3);
    }
}