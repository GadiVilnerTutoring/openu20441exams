package year2023.moed65;

public class Q1
{
	public static int countPairs(int n)
	{
		return countPairs(n, 0, 0, "");
	}

	private static int countPairs(int n, int leftCounter, int rightCounter, String str)
	{
		if (leftCounter < rightCounter || n < 0)
		{
			return 0;
		}
		if (n == 0 && leftCounter == rightCounter)
		{
			System.out.println(str);
			return 1;
		}
		return countPairs(n - 1, leftCounter + 1, rightCounter, str + "(") + countPairs(n, leftCounter, rightCounter + 1, str + ")");
	}
}
