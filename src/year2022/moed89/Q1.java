package year2022.moed89;

public class Q1
{
	public static boolean isJump(String str1, String str2, int step)
	{
		return isJump(str1, str2, step, 0, 0);
	}

	public static boolean isJump(String str1, String str2, int step, int i1, int i2)
	{
		if (i2 >= str2.length())
		{
			return true;
		}
		if (i1 >= str1.length())
		{
			return false;
		}
		if (str1.charAt(i1) != str2.charAt(i2))
		{
			return false;
		}
		return isJump(str1, str2, step, i1 + step, i2 + 1);
	}

	public static int strStep(String str1, String str2)
	{
		return strStep(str1, str2, 1);
	}

	public static int strStep(String str1, String str2, int step)
	{
		if (step > str1.length())
		{
			return -1;
		}
		if (isJump(str1, str2, step))
		{
			return step;
		}
		return strStep(str1, str2, step + 1);
	}

}
