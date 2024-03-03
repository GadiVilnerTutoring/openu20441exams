package year2021.moed85;

public class Q2
{
	public static boolean findAverage(int[] arr, double x)
	{
		int low = 0;
		int high = arr.length - 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		while (low <= high)
		{
			double average = sum / (high - low + 1.0);
			if (average == x)
			{
				return true;
			}
			if (average < x)
			{
				sum -= arr[low];
				low++;
			}
			else
			{
				sum -= arr[high];
				high--;
			}
		}

		return false;
	}

}
