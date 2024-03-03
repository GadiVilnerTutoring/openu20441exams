package year2021.moed60;

public class Q2
{
	public static int smallestSub(int[] a, int k)
	{
		int low = 0;
		int high = 0;
		int sum = a[0];
		int length = a.length + 1;
		while (high < a.length && low < a.length)
		{
			if (sum <= k)
			{
				high++;
				if (high < a.length) sum += a[high];
			}
			else
			{
				if (sum > k)
				{
					length = Math.min(length, high - low + 1);
					sum -= a[low++];
				}
			}
		}

		return length;
	}

}
