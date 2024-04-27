package year2024.moed63;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
        };
        System.out.println(minPoints(m));
    }

    public static int minPoints(int [][] m)
    {
        return minPoints(m, 1);


    }

    private static int minPoints(int[][] m, int number) {
        if (minPoints(m, m.length-1, m[0].length-1, number)){
            return number;
        }

        return minPoints(m, number+1);
    }

    private static boolean minPoints(int[][] m, int i, int j, int number) {
        if (i < 0 || j < 0 || number <= 0){
            return false;
        }
        number += m[i][j];
        if (number <= 0){
            return false;
        }
        if (i == 0 && j == 0){
            return true;
        }
        return minPoints(m, i-1, j, number) ||
                minPoints(m, i, j-1, number);

    }

}
