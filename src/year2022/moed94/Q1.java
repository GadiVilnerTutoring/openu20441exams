package year2022.moed94;

public class Q1
{
	public static int lengthPath(char[][] mat, String pattern)
	{
		return lengthPath(mat, pattern, 0, 0, findFreeChar(pattern, 'a'));
	}

	private static int lengthPath(char[][] mat, String pattern, int i, int j, char ch)
	{
		if (i < 0 || i == mat.length || j < 0 || j == mat[i].length || pattern.indexOf(mat[i][j]) < 0)
		{
			return 0;
		}

		char temp = mat[i][j];
		mat[i][j] = ch;
		int r0 = lengthPath(mat, pattern, i + 1, j, ch);
		int r1 = lengthPath(mat, pattern, i - 1, j, ch);
		int r2 = lengthPath(mat, pattern, i, j + 1, ch);
		int r3 = lengthPath(mat, pattern, i, j - 1, ch);
		mat[i][j] = temp;
		return Math.max(Math.max(r0, r1), Math.max(r2, r3)) + 1;
	}

	private static char findFreeChar(String pattern, char ch) {
		if (pattern.indexOf(ch) < 0){
			return ch;
		}
		return findFreeChar(pattern, (char)(ch+1));
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

		int length = lengthPath(mat, pattern, i, j, findFreeChar(pattern, 'a'));
		return Math.max(length, maxPath(mat, pattern, i, j + 1));
	}
}
