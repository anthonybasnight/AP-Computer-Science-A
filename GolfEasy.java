
public class GolfEasy
{
    private int par;
    private int score;
    public GolfEasy(int p, int s)
    {
        par = p;
        score = s;
    }
    public void setPar(int p)
    {
        par = p;
    }
    public void setScore(int s)
    {
        score = s;
    }
    public int getPar()
    {
        return par;
    }
    public int getScore()
    {
        return score;
    }
    public String toString()
    {
        if (par - score == 0)
            return "par";
        if (par - score == 1)
            return "birdie";
        if (par - score == 2)
            return "eagle";
        if (par - score == -1)
            return "bogey";
        if (par - score == -2)
            return "double bogey";
        return "you are either really good or really bad";
    }
}