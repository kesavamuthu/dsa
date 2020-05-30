public class PascalTriangle
{

    public static void main(String[] args)
    {
        int[][] triangle = new int[5][5];

        triangle[0][0] = 1;
        triangle[1][0] = 1;
        triangle[1][1] = 1;

        for(int i = 2; i < triangle.length; ++i)
            for(int j = 1; j < triangle[2].length - 1; ++j)
            {
                triangle[i][j] = 1;
                for(int k = i; k <= j; ++k);

            }
    }
}
