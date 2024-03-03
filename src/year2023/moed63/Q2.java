package year2023.moed63;

public class Q2
{
	public static int findSmallestSubarrayLen(int[] arr, int num)
	{
		int low = 0;
		int high = 0;
		int sum = arr[0];
		int lowest = 0;
		int highest = arr.length;
		while (high < arr.length)
		{
			if (sum <= num)
			{
				high++;
				if (high < arr.length)
				{
					sum += arr[high];
				}
			}
			else
			{
				System.out.println("Subarray found [" + low + "-" + high + "]");
				if (high - low < highest - lowest)
				{
					highest = high;
					lowest = low;
				}

				sum -= arr[low];
				low++;
			}
		}
		if (highest == arr.length){
			System.out.println("No subarray exists");
			return 0;
		}
		System.out.println("Smallest Subarray found [" + lowest + "-" + highest + "]");
		return highest - lowest + 1;
	}
}
