package year2023.moed54;

public class Q1
{
	public static int selectedPrimes(int num, int x)
	{
		return selectedPrimes(num, x, 2, 0);
	}

	private static int selectedPrimes(int num, int x, int currentPrime, int count)
	{
		if (num == 1)
		{
			return count;
		}

		if (num % currentPrime == 0)
		{
			int pow = findPower(num, currentPrime, 0);
			if (pow == x)
			{
				System.out.println(currentPrime);
				count++;
			}

			num /= Math.pow(currentPrime, pow);
		}
		return selectedPrimes(num, x, nextPrime(currentPrime), count);
	}

	private static int findPower(int num, int currentPrime, int count)
	{
		if (num % currentPrime != 0)
		{
			return count;
		}
		return findPower(num / currentPrime, currentPrime, count + 1);
	}

	public static int nextPrime(int currentPrime)
	{
		for (int i = currentPrime + 1; true; i++)
		{
			if (isPrime(i))
			{
				return i;
			}
		}
	}

	private static boolean isPrime(int num)
	{
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}

		return true;
	}
}
