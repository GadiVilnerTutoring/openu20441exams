package year2020.moedJune;

public class Q2 {

    public static void main(String[] args) {
        int[][] mat = {
                {4,5,6,7,1},
                {3,5,1,7,4},
                {4,5,6,7,8},
                {3,4,5,7,9},
                {3,2,2,7,6}
        };
        System.out.println(minDiagSnake(mat));
    }

    public static int minDiagSnake(int[][] mat)
    {
        return minDiagSnake(mat, 0, 0, mat[0][0], 0);
    }

    private static int minDiagSnake(int[][] mat, int i, int j, int prevCellNum, int count)
    {
        if (i < 0 || i == mat.length || j < 0 || j == mat[i].length || Math.abs(prevCellNum - mat[i][j]) > 1)
        {
            return Integer.MAX_VALUE;
        }
        count++;
        if (i == mat.length - 1 && j == mat[i].length - 1)
        {
            return count;
        }

        mat[i][j] *= -1;
        int r1 = minDiagSnake(mat, i + 1, j + 1, -mat[i][j], count);
        int r2 = minDiagSnake(mat, i + 1, j - 1, -mat[i][j], count);
        int r3 = minDiagSnake(mat, i - 1, j + 1, -mat[i][j], count);
        int r4 = minDiagSnake(mat, i - 1, j - 1, -mat[i][j], count);
        mat[i][j] *= -1;
        return Math.min(Math.min(r1, r2), Math.min(r3, r4));
    }

}
