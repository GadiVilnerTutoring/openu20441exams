package year2023.moed81;

public class Q2
{
	public static boolean findSubArraySum(int[] arr, int target)
	{
		if (arr.length == 0)
		{
			if (target == 0)
			{
				return true;
			}

			return false;
		}
		int low = 0;
		int high = 0;
		int sum = arr[0];
		while (high < arr.length)
		{
			if (sum == target)
			{
				System.out.println("Subarray found between indexes " + low + " and " + high + " with sum " + target);
				return true;
			}

			if (sum < target)
			{
				high++;
				if (high < arr.length)
				{
					sum += arr[high];
				}
			}
			else
			{
				sum -= arr[low];
				low++;
			}

		}

		System.out.println("No subarray found with sum " + target);
		return false;
	}

}
