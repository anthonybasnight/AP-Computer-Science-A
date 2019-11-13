public class Book
{
    private String title;
    private String name;
    private int pages;
    public Book(String t, String n, int p)
    {
        title = t;
        name = n;
        pages = p;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setPages(int p)
    {
        pages = p;
    }
    public String gitTitle()
    {
        return title;
    }
    public String gitName()
    {
        return name;
    }
    public int gitPages()
    {
        return pages;
    }
    public String toString()
    {
        return "Title: " + title + "  Author: " + name + "  Number of Pages: " + pages;
    }
}