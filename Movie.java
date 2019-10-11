
public class Movie
{
    // instance variables are the adjectives to describe the object
    private String title;
    private String genre;
    private double lengthInMin;
    private double ratingOnRottenTomatoes;
    
    // constructor definition
    public Movie(String titl, String gen, double len, double rating)
    {
        title = titl;
        genre = gen;
        lengthInMin = len;
        ratingOnRottenTomatoes = rating;
    }
    
    //mutator method for changing private data
    public void setTitle(String t)
    {
        title = t;
    }
    public String getTitle()
    {
        return title;
    }
    
    public void setGenre(String g)
    {
        genre = g;
    }
    public String getGenre()
    {
        return genre;
    }
    
    public void setLength(double l)
    {
        lengthInMin = l;
    }
    public double getLength()
    {
        return lengthInMin;
    }
    
    public void setRating(double r)
    {
        ratingOnRottenTomatoes = r;
    }
    public double getRating()
    {
        return ratingOnRottenTomatoes;
    }
}