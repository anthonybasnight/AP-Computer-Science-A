/**
 * @author Henry Basnight
 */
public class BaseballPlayer
{
    private String name;
    private int number;
    private String position;
    private String team;
    public static String PROFESSION = "Professional Baseball Player";
    
    /**
     * No args constructor for the BaseballPlayer Class
     */
    public BaseballPlayer()
    {
        name = "Mookie Betts";
        number = 50;
        position = "Right Fielder";
        team = "Boston Red Sox";
    }
    
    /**
     * Constructor method that takes four parameter variables
     * @param n the player's name
     * @param num the player's number
     * @param p the player's position
     * @param t the player's team
     */
    public BaseballPlayer(String n, int num, String p, String t)
    {
        name = n;
        number = num;
        position = p;
        team = t;
    }
    
    /**
     * Mutator method to change the player's name
     * @param n the name we are changing the player's name to
     */
    public void setName(String n)
    {
        name = n;
    }
    
    /**
     * Mutator method to change the player's number
     * @param num the number we are changing the player's number to
     */
    public void setNumber(int num)
    {
        number = num;
    }
    
    /**
     * Mutator method to change the player's position
     * @param p the position we are changing the player's position to
     */
    public void setPosition(String p)
    {
        position = p;
    }
    
    /**
     * Mutator method to change the player's team
     * @param t the team we are changing the player's team to
     */
    public void setTeam(String t)
    {
        team = t;
    }
    
    /**
     * Accessor method to get the player's name
     * @return the player's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor method to get the player's number
     * @return the player's number
     */
    public int getNumber()
    {
        return number;
    }
    
    /**
     * Accessor method to get the player's position
     * @return the player's position
     */
    public String getPosition()
    {
        return position;
    }
    
    /**
     * Accessor method to get the player's team
     * @return the player's team
     */
    public String getTeam()
    {
        return team;
    }
    
    public String toString()
    {
        return "Name: " + name + ";  Number: " + number + ";  Position: " + position + ";  Team: " + team;
    }
    
    public boolean equals(BaseballPlayer b)
    {
        if (name == b.getName() && number == b.getNumber() && position == b.getPosition() && team == b.getTeam())
            return true;
        return false;
    }
}