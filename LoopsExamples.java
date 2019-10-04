
public class LoopsExamples
{
    public static void main(String[] args)
    {
        int x = 5; // Declaring and initializing a variable
        int y; // Declaring a variable
        y = 2; // Assigning or setting a value
        
        int numCoins = 4;
        numCoins = numCoins + 1;
        numCoins += 1;
        numCoins ++;
        System.out.println("Mario has " + numCoins + " coins");
        
        int numLives = 0;
        numLives = numLives + 3;
        numLives += 3;
        System.out.println(" Mario has " + numLives + " lives");
        System.out.println("POWERUP");
        numLives = numLives * 3;
        numLives *= 3;
        System.out.println(" Now Mario has " + numLives + " lives");
        System.out.println("OUCH");
        numLives = numLives / 2;
        numLives /= 3;
        System.out.println(" Now Mario has " + numLives + " lives");
        
        
        for (int i = 0; i <= 8; i ++)
        {
            System.out.println(i);
        }
        for (int i = 0; i <= 50; i ++)
        {
            System.out.println(i);
        }
        for (int i = 50; i >= 0; i --)
        {
            System.out.println(i);
        }
        
    }
}