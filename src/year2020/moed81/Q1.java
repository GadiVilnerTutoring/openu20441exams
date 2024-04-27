package year2020.moed81;

public class Q1 {
    public static int makeSum(int[] lengths, int k, int num)
    {
        return makeSum(lengths, k, num, 0);
    }

    private static int makeSum(int[] lengths, int k, int num, int i)
    {
        if (i == lengths.length || num < 0 || k < 0)
        {
            return 0;
        }
        if (k == 0)
        {
            return 1;
        }

        return makeSum(lengths, k - lengths[i], num - 1, i) +//take AND STAY
                makeSum(lengths, k, num, i + 1);//no take and MOVE ON
    }

}
