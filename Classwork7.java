public class Classwork7
{
    public static void main(String[] args)
    {
        System.out.println(findSum(2, 3));
    }
    
    public static double findSum(int a, int b)
    {
        return a + b; 
    }
    
    public static String canIVote(int age)
    {
        if (age >= 18)
            return "You can vote!";
        else
            return "You can't vote :/";
    }
    
    public static String quadForm(int a, int b, int c)
    {
        double x1 = (((-1) * b) + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        double x2 = (((-1) * b) - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        String answer = "x = " + x1 + " or " + x2;
        return answer;
    }
    
    public static String alphaOrder(String name)
    {
        if (name.equals("Jason") || name.equals("jason"))
            return "Wow that name sucks!";
        else if (name.equals("Henry") || name.equals("henry"))
            return "Damn that name is good!";
        else
            return "Your name is ok i guess...";
    }
}