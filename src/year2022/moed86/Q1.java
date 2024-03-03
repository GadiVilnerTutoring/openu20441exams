package year2022.moed86;

public class Q1
{
	public static int maxPath(int[][] mat)
	{
		return maxPath(mat, 0, 0, 0);
	}

	private static int maxPath(int[][] mat, int i, int j, int sum)
	{
		if (i >= mat.length || j >= mat[i].length)
		{
			return Integer.MIN_VALUE;
		}
		sum += mat[i][j];
		if (i == mat.length - 1 && j == mat[i].length - 1)
		{
			return sum;
		}
		int r0 = maxPath(mat, i + mat[i][j] / 10, j + mat[i][j] % 10, sum);
		int r1 = maxPath(mat, i + mat[i][j] % 10, j + mat[i][j] / 10, sum);

		return Math.max(r0, r1);
	}
}
