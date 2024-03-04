package year2021.moed70;

public class Q2
{
	public static int getMedian(int[] a, int[] b)
	{
		int lowA = 0;
		int lowB = 0;
		int highA = a.length - 1;
		int highB = a.length - 1;

		while (lowA + 1 < highA)
		{
			int medianA = getMedian(a, lowA, highA);
			int medianB = getMedian(a, lowB, highB);

			if (medianA == medianB)
			{
				return medianA;
			}

			if (medianA < medianB)
			{
				lowA = (lowA + highA) / 2;
				if ((highB - lowB) % 2 == 1)
				{
					highB = 1 + (lowB + highB) / 2;
				}
				else
				{
					highB = (lowB + highB) / 2;
				}
			}
			else
			{
				lowB = (lowB + highB) / 2;
				if ((highA - lowA) % 2 == 1)
				{
					highA = 1 + (lowA + highA) / 2;
				}
				else
				{
					highA = (lowA + highA) / 2;
				}
			}
		}

		return (Math.min(a[highA], b[highB]) + Math.max(a[lowA], b[lowB])) / 2;

	}

	private static int getMedian(int[] arr, int low, int high)
	{
		int mid = (low + high) / 2;
		if ((low + high) % 2 == 0)
		{
			return arr[mid];
		}

		return (arr[mid] + arr[mid + 1]) / 2;

	}
}
