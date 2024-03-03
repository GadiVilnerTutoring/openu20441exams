package year2023.moed72;

public class Q2
{
	public static int findPeak(int[] arr)
	{
		int low = 0;
		int high = arr.length - 1;
		while (low < high)
		{
			int mid = (low + high) / 2;
			if ((mid == high || arr[mid] >= arr[mid + 1]) && (mid == low || arr[mid] >= arr[mid - 1]))
			{
				return mid;
			}

			if (arr[mid] < arr[mid + 1])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}

		}

		return low;
	}
}
