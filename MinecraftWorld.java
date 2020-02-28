
public class MinecraftWorld
{
    private String mobName;
    private int health;
    private int hunger;
    
    public MinecraftWorld()
    {
        mobName = "Minecraft Steve";
        health = 7;
        hunger = 4;
    }
    
    public MinecraftWorld(String n, int he, int hu)
    {
        mobName = n;
        health = he;
        hunger = hu;
    }
    
    public void setName(String n)
    {
        mobName = n;
    }
    
    public void setHealth(int h)
    {
        health = h;
    }
    
    public void setHunger(int h)
    {
        hunger = h;
    }
    
    public String getName()
    {
        return mobName;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getHunger()
    {
        return hunger;
    }
    
    public String toString()
    {
        return "Name: " + mobName + "; Health: " + health + "; Hunger: " + hunger;
    }
}