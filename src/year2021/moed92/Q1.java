package year2021.moed92;

public class Q1 {
    public static int printExpr(int[] arr, int num) {
        return printExpr(arr, num, 0, 0, "");
    }

    private static int printExpr(int[] arr, int num, int i, int sum,  String exp) {
        if (i == arr.length) {
            if (sum == num) {
                System.out.println(exp);
                return 1;
            }
            return 0;
        }
        return  printExpr(arr, num, i + 1, sum + arr[i], exp + "+" + arr[i]) +
                printExpr(arr, num, i + 1, sum - arr[i], exp + "-" + arr[i]) +
                printExpr(arr, num, i + 1, sum, exp);
    }

}
