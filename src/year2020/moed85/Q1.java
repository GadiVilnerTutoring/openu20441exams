package year2020.moed85;

public class Q1 {
    public static int findMaximum(int[][] mat){
        if (mat[0][0] == -1) return -1;
        return findMaximum(mat,0,0, 0);
    }

    private static int findMaximum(int[][] mat, int i, int j, int sum) {
        if (i == mat.length || j < 0 || j == mat[0].length || mat[i][j] == -1){
            return sum;
        }
        int temp = mat[i][j];
        sum += temp;
        mat[i][j] = -1;
        int result = findMaximum(mat, i+1, j, sum);
        if (i % 2 == 0) {
            result = Math.max(result, findMaximum(mat, i, j + 1, sum));
        }else {
            result = Math.max(result, findMaximum(mat, i, j - 1, sum));
        }

        mat[i][j] = temp;
        return result;
    }

}
