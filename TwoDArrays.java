

public class TwoDArrays
{
    public static void main(String[] args)
    {
        System.out.println(" ");
        int[][] temps = new int[5][3];
        temps[0][0] = 97;
        temps[0][1] = 99;
        temps[0][2] = 101;
        temps[1][0] = 102;
        temps[1][1] = 100;
        temps[1][2] = 95;
        temps[2][0] = 93;
        temps[2][1] = 92;
        temps[2][2] = 92;
        temps[3][0] = 91;
        temps[3][1] = 86;
        temps[3][2] = 85;
        temps[4][0] = 87;
        temps[4][1] = 83;
        temps[4][2] = 77;
        
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 3; j++)
                System.out.print(temps[i][j] + " ");
            System.out.println(" ");
        }
        
        System.out.println(" ");
        String[] names = {"Samuel", "Jarson", "AB"};
        String[] ages = {"17", "16", "14"};
        String[][] studentInfo = {names, ages};
        
        for (int k = 0; k < 2; k++)
        {
            for (int p = 0; p < 3; p++)
                System.out.print(studentInfo[k][p] + " ");
            System.out.println(" ");
        }
        
        System.out.println(" ");
        double[][] averages = {{2.6, 3.1, 4.7}, {6.3, 8.9, 1.1}};
        
        for (int x = 0; x < averages.length; x++)
        {
            for (int y = 0; y < averages[x].length; y++)
                System.out.print(averages[x][y] + " ");
            System.out.println(" ");
        }
    }
}