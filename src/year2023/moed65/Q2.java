package year2023.moed65;

public class Q2
{
	public static boolean superInc(int[] arr, int k)
	{
		for (int i = arr.length - 1; i >= 0; i--)
		{
			if (arr[i] <= k)
			{
				k -= arr[i];
			}
			if (0 == k)
			{
				return true;
			}
		}

		return false;
	}

}
