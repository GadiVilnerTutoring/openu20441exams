package year2023.moed81;

public class Q1
{
	public static int greatestRoute(int[][] mat)
	{
		return greatestRoute(mat, 0, 0, 0, "");
	}

	private static int greatestRoute(int[][] mat, int i, int j, int sum, String path)
	{
		if (i < 0 || i == mat.length || j < 0 || j == mat[0].length || mat[i][j] / 10 == mat[i][j] % 10)
		{
			return 0;
		}

		String cellStamp = "(" + i + "," + j + ")";
		sum += mat[i][j] % 10;
		if (path.length() > 0)
		{
			path += " --> ";
		}
		path += cellStamp;
		if (i == mat.length - 1 && j == mat[0].length - 1)
		{
			System.out.println(path + " = " + sum);
			return sum;
		}

		mat[i][j] += 10;
		int op1 = greatestRoute(mat, i + 1, j, sum, path);
		int op2 = greatestRoute(mat, i - 1, j, sum, path);
		int op3 = greatestRoute(mat, i, j + 1, sum, path);
		int op4 = greatestRoute(mat, i, j - 1, sum, path);
		mat[i][j] -= 10;
		return Math.max(Math.max(op1, op2), Math.max(op3, op4));
	}

}
