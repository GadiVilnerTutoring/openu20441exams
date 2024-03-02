package year2020;

public class Exam2020_84 {

    public static void main(String[] args) {
        char[][] arr = {
                {'q','w','e','o','t'},
                {'s','h','a','l','k'},
                {'a','a','l','o','m'},
                {'b','v','x','d','g'},
                {'s','a','f','h','g'}
        };
        findWord(arr, "shalom");
    }

    public static void findWord(char[][] arr, String word) {
        int[][] printMat = new int[arr.length][arr.length];
        if (findWord(arr, word, printMat, 0, 0)) {
            printArr(printMat);
        } else {
            System.out.println("No Such Word");
        }
    }

    private static boolean findWord(char[][] arr, String word, int[][] printMat, int i, int j) {
        if (i == arr.length) {
            return false;
        }
        if (j == arr.length) {
            return findWord(arr, word, printMat, i + 1, 0);
        }

        if (findWord(arr, word, printMat, i, j, 0)) {
            return true;
        }

        return findWord(arr, word, printMat, i, j + 1);
    }

     private static boolean scanMat(int[][] mat, int i, int j) {
        if (i == mat.length) {
            return false;
        }
        if (j == mat[0].length) {
            return scanMat(mat, i + 1, 0);
        }

        return scanMat(mat, i, j + 1);
    }

    private static boolean findWord(char[][] arr, String word, int[][] printMat, int i, int j, int wordIndex) {
        if (wordIndex == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i == arr.length || j == arr.length || printMat[i][j] > 0) {
            return false;
        }
        if (arr[i][j] != word.charAt(wordIndex)) {
            return false;
        }

        printMat[i][j] = wordIndex + 1;
        if (!findWord(arr, word, printMat, i + 1, j, wordIndex + 1)) {
            if (!findWord(arr, word, printMat, i - 1, j, wordIndex + 1)) {
                if (!findWord(arr, word, printMat, i, j + 1, wordIndex + 1)) {
                    if (!findWord(arr, word, printMat, i, j - 1, wordIndex + 1)) {
                        printMat[i][j] = 0;
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static void printArr(int[][] printMat) {
        for (int i = 0; i < printMat.length; i++) {
            for (int j = 0; j < printMat.length; j++) {
                System.out.print(printMat[i][j]);
            }
            System.out.println();
        }
    }
}
