import java.util.Scanner;

public class Classwork4 // class header
{
    public static void main(String[] args) // method header
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter your name:");
        
        String name = scan.nextLine();
        
        System.out.println("Hello, " + name);
        
        if (name.equals("Henry") || name.equals("henry"))
        {
            System.out.println("You sound like an awesome guy");
            
        }
        
        System.out.println("Enter your age:");
        
        int age = scan.nextInt();
        
        if ((age < 18) && (age > 16))
        {
            System.out.println("Do you live in Northern Ireland? Yes or No:");
            String yesOrNo = scan.nextLine();
            if (yesOrNo.equals("Yes") || yesOrNo.equals("yes"))
            {
                System.out.println("Sorry, you are not allowed to engage in sexual activities");

            }
            if (yesOrNo.equals("No") || yesOrNo.equals("no"))
            {
                System.out.println("You are allowed to engage in sexual activities with either a 16 or 17 years old");
                
            }
        }
        if (age > 18)
        {
            System.out.println("You're good to go");
            
        }
    }
}