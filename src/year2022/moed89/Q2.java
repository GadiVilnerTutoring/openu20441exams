package year2022.moed89;

public class Q2
{
	public static int longestSubarray(int[] a)
	{
		int start = 0;
		int end = 0;
		int low = 0;
		int high = 0;
		while (high < a.length - 1)
		{
			if (a[high] / Math.abs(a[high]) != a[high + 1] / Math.abs(a[high + 1]))
			{
				high++;
				if (high - low > end - start)
				{
					start = low;
					end = high;
				}
			}
			else
			{
				low = high + 1;
				high++;
			}
		}

		System.out.println("Starting index = " + start + " Ending index = " + end);
		return end - start + 1;
	}

}
