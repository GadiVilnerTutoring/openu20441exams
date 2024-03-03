package year2023.moed72;

public class Q1
{
	public static int friend3(int[][] mat)
	{
		return friend3(mat, 0, 1, 2, 0);
	}

	private static int friend3(int[][] mat, int i, int j, int k, int count)
	{
		if (i == mat.length)
		{
			return count;
		}
		if (j == mat.length)
		{
			return friend3(mat, i + 1, i + 2, i + 3, count);
		}
		if (k == mat.length)
		{
			return friend3(mat, i, j + 1, j + 2, count);
		}

		if (mat[i][j] == 1 && mat[i][k] == 1 && mat[j][k] == 1)
		{
			System.out.println(i + " " + j + " " + k);
			count++;
		}

		return friend3(mat, i, j, k + 1, count);
	}

}
