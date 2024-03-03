package year2021.moed62;

public class Q2
{
	public static boolean search(int[][] mat, int num)
	{
		int row = 0;
		int col = 0;
		int size = mat.length;

		while (size > 1)
		{
			int min1 = mat[row][col];
			int max1 = mat[row + size / 2 - 1][col];
			int min2 = mat[row][col + size / 2];
			int max2 = mat[row + size / 2 - 1][col + size / 2];
			int min3 = mat[row + size / 2][col + size / 2];
			int max3 = mat[row + size - 1][col + size / 2];
			int min4 = mat[row + size / 2][col];
			int max4 = mat[row + size - 1][col];

			boolean foundQuarter = false;
			if (num >= min1 && num <= max1)
			{
				foundQuarter = true;
			}
			if (num >= min2 && num <= max2)
			{
				col = col + size / 2;
				foundQuarter = true;
			}
			if (num >= min3 && num <= max3)
			{
				col = col + size / 2;
				row = row + size / 2;
				foundQuarter = true;
			}
			if (num >= min4 && num <= max4)
			{
				row = row + size / 2;
				foundQuarter = true;
			}
			if (foundQuarter == false)
			{
				return false;
			}

			size /= 2;

		}
		System.out.println("row = " + row);
		System.out.println("col = " + col);

		return true;
	}
}
