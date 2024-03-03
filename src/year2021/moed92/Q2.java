package year2021.moed92;

public class Q2
{
	public static int longestSequence(int[] a, int k)
	{
		int i = 0;
		int j = 0;
		int maxSequuence = 0;
		int zeroCount = 0;
		while (j < a.length)
		{
			if (a[j] == 0)
			{
				zeroCount++;
			}

			if (zeroCount > k)
			{
				while (a[i] != 0)
				{
					i++;
				}
				i++;
				zeroCount--;
			}

			maxSequuence = Math.max(maxSequuence, j - i + 1);
			j++;
		}

		return maxSequuence;
	}

}
