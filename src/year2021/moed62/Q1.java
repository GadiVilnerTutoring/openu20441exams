package year2021.moed62;

public class Q1
{
	public static boolean equalSplit(int[] arr)
	{
		return equalSplit(arr, 0, 0, 0, 0, 0);
	}

	private static boolean equalSplit(int[] arr, int i, int sum0, int sum1, int count0, int count1)
	{
		if (i == arr.length)
		{
			return sum0 == sum1 && count0 == count1;
		}

		boolean r0 = equalSplit(arr, i + 1, sum0 + arr[i], sum1, count0 + 1, count1);
		boolean r1 = equalSplit(arr, i + 1, sum0, sum1 + arr[i], count0, count1 + 1);

		return r0 || r1;
	}

}
