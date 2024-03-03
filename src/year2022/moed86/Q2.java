package year2022.moed86;

public class Q2
{
	public static void sortmod(int[] a, int k)
	{
		int index = 0;
		for (int i = 0; i < k; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[j] % k == i)
				{
					swap(a, j, index++);
				}
			}
		}
	}
}
