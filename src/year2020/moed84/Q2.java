package year2020.moed84;

public class Q2 {
    public static void findFactors(int n)
    {
        int low = 2;
        int high = n / 2;
        while (low < high)
        {
            int mid = (low + high) / 2;
            if (isHighFactorInRange(n, low, mid))
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }

        System.out.println(low + " " + (n / low));
    }

    //this method is provided in the question.
    //no need to implement or to considerate in complexity
    private static boolean isHighFactorInRange(int n, int low, int high)
    {
        for (int i = low; i <= high; i++)
        {
            if (n % i == 0)
            {
                if (i > n / i) return true;
            }
        }

        return false;
    }

}
