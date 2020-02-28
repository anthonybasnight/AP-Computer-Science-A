
public class Steve extends MinecraftWorld
{
    private String skin; 
    
    public Steve()
    {
        super();
        skin = "Chicken in a Suit";
    }
    
    public Steve(String n, int he, int hu, String s)
    {
        super(n, he, hu);
        skin = s;
    }
    
    public void setSkin(String s)
    {
        skin = s;
    }
    
    public String getSkin()
    {
        return skin;
    }
    
    public void eatFood()
    {
        int health = super.getHealth() + 1;
        int hunger = super.getHunger() + 2;
        super.setHealth(health);
        super.setHunger(hunger);
    }
    
    public String toString()
    {
        return super.toString() + "; Skin: " + skin;
    }
}