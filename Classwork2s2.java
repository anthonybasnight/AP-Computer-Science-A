import java.util.*;
import java.util.Random;
public class Classwork2s2
{
    public static void main(String[] args)
    {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Soccer");
        s.add("Softball");
        s.add("Basketball");
        s.add("Tennis");
        s.add("Soccer");
        s.add("Skiing");
        s.add("Rowing");
        System.out.println("Question 1: ");
        printElements(s);
        System.out.println("Question 2: ");
        insertElement(s, "Football");
        System.out.println("Question 3: ");
        System.out.println(returnElement(s, 3));
        System.out.println("");
        System.out.println("Question 4: ");
        removeThirdElement(s);
        System.out.println("Question 5: ");
        System.out.println(searchForElement(s, "Soccer"));
        System.out.println("");
        System.out.println("Question 6: ");
        System.out.println(searchAndCountElement(s, "Soccer"));
        System.out.println("");
        System.out.println("Question 7: ");
        System.out.println(copyAndReturnList(s));
        System.out.println("");
        System.out.println("Question 8: ");
        System.out.println(shuffleElements(s));
        System.out.println("");
        System.out.println("Question 9: ");
        reverseElements(s);
    }
    // #1
    public static void printElements(ArrayList<String> s)
    {
        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
        System.out.println("");
    }
    // #2
    public static void insertElement(ArrayList<String> s, String sport)
    {
        s.add(0, sport);
        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
        System.out.println("");
    }
    // #3
    public static String returnElement(ArrayList<String> s, int j)
    {
        return s.get(j);
    }
    // #4
    public static void removeThirdElement(ArrayList<String> s)
    {
        s.remove(2);
        for (int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
        System.out.println("");
    }
    // #5
    public static int searchForElement(ArrayList<String> s, String fakeSport)
    {
        return s.indexOf(fakeSport);
    }
    // #6
    public static int searchAndCountElement(ArrayList<String> s, String fakeSport)
    {
        int count = 0;
        for (int i = 0; i < s.size(); i++)
            if (s.get(i).equals(fakeSport))
                count += 1;
        return count;
    }
    // #7
    public static ArrayList<String> copyAndReturnList(ArrayList<String> s)
    {
        ArrayList<String> n = new ArrayList<String>();
        for (int i = 0; i < s.size(); i++)
            n.add(s.get(i));
        return n;
    }
    // #9
    public static void reverseElements(ArrayList<String> name)
    {
        for (int i = name.size(); i > 0; i--)
            System.out.println(name.get(i));
    }
    // #8
    public static ArrayList<String> shuffleElements(ArrayList<String> s)
    {
        ArrayList<String> name = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < 7; i++)
        {
            name.add(s.get(rand.nextInt(s.size())));
            s.remove(s.indexOf(name.get(i)));
        }
        return name;
    }
    
}