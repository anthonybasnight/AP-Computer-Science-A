import java.util.Scanner;

public class Classwork2
{
    public static void main(String[] args)
    {
        // Construct a scanner object
        Scanner scan = new Scanner(System.in);
        
        // Give the user a prompt
        System.out.println("Enter your age:");
        
        double user_input = scan.nextDouble();
        double compare = 36 / user_input;
        
        System.out.println("Ms. Kennedy is " + compare + " times your age");
        
        // Quadratic formula calculator
        System.out.println("Enter a value for a:");
        double a = scan.nextDouble();
        
        System.out.println("Enter a value for b:");
        double b = scan.nextDouble();
        
        System.out.println("Enter a value for c:");
        double c = scan.nextDouble();
        
        double x1 = (((-1) * b) + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        double x2 = (((-1) * b) - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
        
        System.out.println("x = " + x1 + " or " + x2);
        
    }
    
    
    
}