package year2022.moed74;

public class Q2
{
	public static int findDuplicate(int[] a)
	{

		for (int i = 0; i < a.length; i++)
		{
			if (a[0] == a[a[0]])
			{
				return a[0];
			}
			// swap(0, a[0]);
			int temp = a[0];
			a[0] = a[a[0]];
			a[temp] = temp;// fix this line
		}

		return 0;// we won't reach this line, just for thr co,piler
	}

}
