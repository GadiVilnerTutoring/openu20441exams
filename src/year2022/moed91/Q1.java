package year2022.moed91;

public class Q1
{
	public static int cheapRt(int[] stations, int step1, int step2, int limit)
	{
		return cheapRt(stations, step1, step2, limit, 0, 0, "");
	}

	private static int cheapRt(int[] stations, int step1, int step2, int limit, int i, int sum, String indexes)
	{
		if (limit < 0 || i >= stations.length)
		{
			return Integer.MAX_VALUE;
		}
		sum += stations[i];
		indexes += i + "\t";
		if (i == stations.length - 1)
		{
			System.out.println(indexes + "=" + sum);
			return sum;
		}
		int r0 = cheapRt(stations, step1, step2, limit, i + step1, sum, indexes);
		int r1 = cheapRt(stations, step1, step2, limit - 1, i + step2, sum, indexes);
		return Math.min(r0, r1);
	}

}
