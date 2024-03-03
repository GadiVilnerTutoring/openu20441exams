package year2022.moed94;

public class Q1
{
	public static int lengthPath(char[][] mat, String pattern)
	{
		return lengthPath(mat, pattern, 0, 0);
	}

	private static int lengthPath(char[][] mat, String pattern, int i, int j)
	{
		if (i < 0 || i == mat.length || j < 0 || j == mat[i].length || pattern.indexOf(mat[i][j]) < 0 || mat[i][j] == ' ')
		{
			return 0;
		}

		char temp = mat[i][j];
		mat[i][j] = ' ';
		int r0 = lengthPath(mat, pattern, i + 1, j);
		int r1 = lengthPath(mat, pattern, i - 1, j);
		int r2 = lengthPath(mat, pattern, i, j + 1);
		int r3 = lengthPath(mat, pattern, i, j - 1);
		mat[i][j] = temp;
		return Math.max(Math.max(r0, r1), Math.max(r2, r3)) + 1;
	}

	public static int maxPath(char[][] mat, String pattern)
	{
		return maxPath(mat, pattern, 0, 0);
	}

	private static int maxPath(char[][] mat, String pattern, int i, int j)
	{
		if (i >= mat.length)
		{
			return 0;
		}
		if (j >= mat[i].length)
		{
			return maxPath(mat, pattern, i + 1, 0);
		}

		int length = lengthPath(mat, pattern, i, j);
		return Math.max(length, maxPath(mat, pattern, i, j + 1));
	}
}
