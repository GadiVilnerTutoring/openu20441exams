package year2020.moed81;

public class Q2 {
    public static void minimumSubK(int[] a, int k)
    {
        if (k > a.length)
        {
            return;
        }
        int sum = 0;
        for (int i = 0; i < k; i++)
        {
            sum += a[i];
        }

        int minSum = sum;
        int leftIndex = 0;
        int rightIndex = k - 1;
        for (int i = 0; i < a.length - k; i++)
        {
            sum -= a[i];
            sum += a[i + k];
            if (sum < minSum)
            {
                minSum = sum;
                leftIndex = i + 1;
                rightIndex = i + k;
            }
        }

        System.out.println(leftIndex + ", " + rightIndex);
    }
}
