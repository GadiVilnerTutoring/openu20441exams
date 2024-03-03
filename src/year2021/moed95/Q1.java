package year2021.moed95;

public class Q1
{
	public static String minimalSt(String s1, String s2)
	{
		return minimalSt(s1, s2, "");
	}

	private static String minimalSt(String s1, String s2, String st)
	{
		if (s1.length() == 0)
		{
			return st + s2;
		}
		if (s2.length() == 0)
		{
			return st + s1;
		}
		if (s1.charAt(0) == s2.charAt(0))
		{
			return minimalSt(s1.substring(1), s2.substring(1), st + s1.charAt(0));
		}

		String st2 = minimalSt(s1.substring(1), s2, st + s1.charAt(0));
		String st1 = minimalSt(s1, s2.substring(1), st + s2.charAt(0));

		if (st1.length() < st2.length())
		{
			return st1;
		}

		return st2;
	}

}
