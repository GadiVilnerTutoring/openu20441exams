package year2024.moed69;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(count(7));
    }

    public static int count(int sum){
        return count(sum, 0, 1);
    }

    private static int count(int sum, int currSum, int i) {
        if (currSum == sum) return 1;
        if (currSum > sum) return 0;
        if (i > sum) return 0;
        return count(sum,currSum+i, i+1)+//take
                count(sum,currSum, i+1);//no take
    }
}
