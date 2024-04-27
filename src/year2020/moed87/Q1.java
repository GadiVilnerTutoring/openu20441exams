package year2020.moed87;

public class Q1 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        System.out.println(totalWays(mat, 2));
    }

    private static int totalWays(int[][] mat, int k)
    {
        return totalWays(mat, k, 0, 0, 'S');//'S' for start
    }

    private static int totalWays(int[][] mat, int k, int i, int j, char direction)
    {
        if (i >= mat.length || j >= mat[i].length || k < 0)
        {
            return 0;
        }

        if (i == mat.length - 1 && j == mat[i].length - 1 && k == 0)
        {
            return 1;
        }

        //'D' for down
        //'R' for right
        return totalWays(mat, direction == 'R' ? k-1 : k, i + 1, j, 'D') + totalWays(mat, direction == 'D' ? k-1 : k, i, j + 1, 'R');
    }

}
