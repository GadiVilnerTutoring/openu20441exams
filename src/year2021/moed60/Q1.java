package year2021.moed60;

public class Q1
{
	public static boolean split3(int[] arr)
	{
		return split3(arr, 0, 0, 0, 0);
	}

	private static boolean split3(int[] arr, int i, int s1, int s2, int s3)
	{
		if (i == arr.length)
		{
			return s1 == s2 && s2 == s3;
		}
		return split3(arr, i + 1, s1 + arr[i], s2, s3) || split3(arr, i + 1, s1, s2 + arr[i], s3) || split3(arr, i + 1, s1, s2, s3 + arr[i]);
	}

}
