package year2020.moed85;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,2,4,4,5};
        System.out.println(strictlyIncreasing(a));
    }
    public static int strictlyIncreasing(int[] a)
    {
        int low = 0;
        int high = 1;
        int count = 0;
        while (high < a.length)
        {
            if (a[high] > a[high - 1])
            {
                count += high - low;
            }
            else
            {
                low = high;
            }

            high++;
        }

        return count;
    }

}
