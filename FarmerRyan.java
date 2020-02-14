import java.util.*;
/**
 * This program will calculate the total number of beans in the beanbags
 *
 * @author Henry Basnight
 * @version 02/12/2020
 */
public class FarmerRyan
{
    public static void main(String[] args)
    {
        int total = 0;
        ArrayList<Integer> beans = new ArrayList<>();
        for (int i = 0; i < beans.size(); i++)
        {
            total += beans.get(i);
        }
        System.out.println("Ryan has to plant " + total + " beans");
    }
    
    
    private int bean;
    
    public FarmerRyan(int b)
    {
        bean = b;
    }
    public void setBeans(int b)
    {
        bean = b;
    }
    public int getBeans()
    {
        return bean;
    }
    
}
