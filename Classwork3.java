import java.util.Scanner;

public class Classwork3
{
   public static void main(String[] args)
   {
        /** Objective #1: Write an application to accept a side length for a prism,
        * and output the volume of a cube.
        *
        * Precondition: The user enters a number for the side length, and not a special character or letter
        * Postcondition: The program outputs a volume if the user enters a positive number. If the user
        *       does not enter a positive number, the program responds with "Invalid Input"
        */
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a side length for a cube:");
        double side = scan.nextDouble();
    
        if (side > 0)
        {
            double volume = Math.pow(side, 3);
            System.out.println("Volume: " + volume);
           
        }
       
        else
            System.out.println("Invalid Entry");
            
    
    

        /** Objective #2: Write an application to solve a quadratic equation, which accepts a, b and c
        * from a user, and outputs one of the solutions to the equation.
        * 
        * Precondition: The user enters numbers for a, b, and c
        * Postcondition: The program tells you if there is 1, 2, or 0 solutions
        * 
        */      
        
        System.out.println("Welcome to the quadratic formula calculator");
        System.out.println(" ");
        System.out.println("Enter a value for a:");
        double a = scan.nextDouble();
        
        System.out.println("Enter a value for b:");
        double b = scan.nextDouble();
        
        System.out.println("Enter a value for c:");
        double c = scan.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        if(discriminant < 0)
            System.out.println("No real solutions");
            
        else if(discriminant == 0)
            System.out.println("One solution");
            
        else
            System.out.println("Two solutions");
    
  
    
    }
}
