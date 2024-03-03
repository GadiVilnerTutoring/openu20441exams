package year2022.moed67;

public class Q2
{
	public static int findMissingIndex(int[] a)
	{
		int d;
		if (a[1] - a[0] == a[2] - a[1])
		{
			d = a[1] - a[0];
		}
		else
		{
			if (Math.abs(a[1] - a[0]) < Math.abs(a[2] - a[1]))
			{
				return 2;
			}
			return 1;
		}

		int low = 0;
		int high = a.length - 1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (mid > 0 && a[mid] - a[mid - 1] != d)
			{
				return mid;
			}
			if (a[0] + mid * d == a[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}

		return a.length;
	}

}
