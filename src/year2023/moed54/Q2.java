package year2023.moed54;

public class Q2
{
	public static int findAlmostSorted(int[] arr, int num)
	{
		int low = 0;
		int high = arr.length - 1;

		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (arr[mid] == num)
			{
				return mid;
			}
			if (num < arr[mid])
			{
				if (mid < high && num == arr[mid + 1])
				{
					return mid + 1;
				}
				high = mid - 1;
			}
			else
			{
				if (mid > low && num == arr[mid - 1])
				{
					return mid - 1;
				}
				low = mid + 1;
			}
		}

		return -1;
	}

}
