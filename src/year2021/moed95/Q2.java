package year2021.moed95;

public class Q2
{
	public static int[] findTrue(int[][] tmp)
	{
		int low = 0;
		int high = tmp.length - 1;
		int[] pos =
		{ -1, -1 };
		while (pos[0] == -1)
		{
			int mid = (low + high) / 2;
			int[] result = ask(mid, mid);
			if (result[0] == 0)
			{
				pos[0] = mid;
			}
			if (result[0] < 0)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}

		low = 0;
		high = tmp.length - 1;

		while (pos[1] == -1)
		{
			int mid = (low + high) / 2;
			int[] result = ask(mid, mid);
			if (result[1] == 0)
			{
				pos[1] = mid;
			}
			if (result[1] < 0)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}

		return pos;
	}

}
