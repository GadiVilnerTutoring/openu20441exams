package year2024.moed69;

public class Q2 {

    public static void main(String[] args) {
        int[] arr = new int[4];
        int s = 14;
        minNumWithSum(arr, s);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void minNumWithSum(int[] arr, int s)
    {
        if (s > arr.length*9 || s < arr.length){
            return;
        }

        for (int index = 0; index < arr.length; index++)
        {
            for (int num = 1; arr[index] == 0 && num <= 9; num++) {
                if (s - num <= 9*(arr.length-index- 1))
                {
                    arr[index] = num;
                    s-= num;
                }
            }
        }
    }
}
