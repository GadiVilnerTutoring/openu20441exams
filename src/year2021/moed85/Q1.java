package year2021.moed85;

public class Q1
{
	public static int minPrice(int[][] mat)
	{
		int fromStation = 0;
		int toStation = 1;
		return minPrice(mat, fromStation, toStation);
	}

	private static int minPrice(int[][] mat, int fromStation, int toStation)
	{
		if (fromStation == mat.length - 1)
		{// we got to our destination
			return 0;
		}
		if (toStation == mat.length)
		{// we went too far
			return Integer.MAX_VALUE;
		}
		int passingStation = minPrice(mat, fromStation, toStation + 1);
		int movingToNextStation = minPrice(mat, toStation, toStation + 1);
		int usingStation = movingToNextStation + mat[fromStation][toStation];
		return Math.min(passingStation, usingStation);
	}
}
