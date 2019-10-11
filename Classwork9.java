/**
 * Write a description of class Student here.
 * 
 * @author Kelly Kennedy 
 * @version Student 1.0
 */
public class Classwork9
{
    private int id;
    private String firstName, course;
    private double percent;     // current percentages for the student's course
    
    /**
     * Default constructor for the Student class
     */
    public Classwork9()
    {
        id = 0;
        firstName = "";
        course = "";
        percent = 0.0;
        
    }
    
     /**
     * Constructor for the Student class with parameter variables to initialize the 
     * instance data
     * 
     * @param studentID the student's ID number
     * @param firstN the student's first name
     * @param cour the course the student is enrolled in
     * @param perc the current grade percentage the student has for the course
     */
    public Classwork9(int studentID, String firstN, String cour, double perc)
    {
        id = studentID;
        firstName = firstN;
        course = cour;
        percent = perc;    
    }
    
    /**
     * Method to set the ID for the student
     * @param studentID the student's id number
     */
    public void setID(int studentID)
    { id = studentID; }
    
    /**
     * Method to change the first name for the student
     * @param firstN what the student's first name should change to
     */
    public void setFirstName(String firstN)
    {   firstName = firstN; }
    
    /**
     * Method to change the course for the student
     * @param cour what the student's course should change to
     */
    public void setCourse(String cour)
    {   course = cour;   }
    
     /**
     * Method to change the percent for the student
     * @param perc what the student's percentage should change to
     */
    public void setPercent(double perc)
    {   percent = perc;     }
    
    /**
     * Method to access the student's ID
     * @return the student's ID
     */
    public int getID()
    { return id;    }
    
     /**
     * Method to access the student's first name
     * @return the student's first name
     */
    public String getFirstName()
    {   return firstName;   }
    
     /**
     * Method to access the student's course
     * @return the student's course
     */
    public String getCourse()
    {   return course;  }
    
     /**
     * Method to access the student's percent
     * @return the student's percentage
     */
    public double getPercent()
    {   return percent;    }
}