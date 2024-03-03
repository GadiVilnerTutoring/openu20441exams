package year2021.moed70;

public class Q1
{
	public static int findMaxPrice(int[] prices, int n)
	{
		return findMaxPrice(prices, n, 1);
	}

	private static int findMaxPrice(int[] prices, int n, int i)
	{
		if (n == 0)
		{
			return 0;
		}
		if (i == prices.length || n < 0)
		{
			return Integer.MIN_VALUE;
		}

		int r1 = findMaxPrice(prices, n - i, i) + prices[i];
		int r2 = findMaxPrice(prices, n, i + 1);
		return Math.max(r1, r2);
	}
}
