package year2022.moed67;

public class Q1
{
	public static boolean isIdentity(int[][] mat, int x, int size)
	{
		return isIdentity(mat, x, size, x, x);
	}

	private static boolean isIdentity(int[][] mat, int x, int size, int i, int j)
	{
		if (i == x + size)
		{
			return true;
		}
		if (j == x + size)
		{
			return isIdentity(mat, x, size, i + 1, x);
		}

		if (i == j & mat[i][j] != 1)
		{
			return false;
		}
		if (i != j & mat[i][j] != 0)
		{
			return false;
		}

		return isIdentity(mat, x, size, i, j + 1);
	}

	public static int maxMatrix(int[][] mat)
	{
		return maxMatrix(mat, 0, mat.length);
	}

	private static int maxMatrix(int[][] mat, int x, int size)
	{
		if (size < 1)
		{
			return 0;
		}
		if (isIdentity(mat, x, size))
		{
			return size;
		}

		return maxMatrix(mat, x + 1, size - 2);
	}

}
