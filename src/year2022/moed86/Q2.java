package year2022.moed86;

public class Q2
{
	public static void main(String[] args) {
		int[] a= {35,17,13,252,4,128,7,3,81};
		sortmod(a, 10);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void sortmod(int[] a, int k)
	{
		int index = 0;
		for (int i = 0; i < k; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[j] % k == i)
				{
					swap(a, j, index++);
				}
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
