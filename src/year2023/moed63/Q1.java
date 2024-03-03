package year2023.moed63;

public class Q1
{
	public static String minimalSt(String st1, String st2)
	{
		return minimalSt(st1, st2, 0, 0, "");
	}

	private static String minimalSt(String st1, String st2, int i1, int i2, String st)
	{
		if (i1 == st1.length() && i2 == st2.length())
		{
			return st;
		}
		if (i1 == st1.length())
		{
			return minimalSt(st1, st2, i1, i2 + 1, st + st2.charAt(i2));
		}
		if (i2 == st2.length())
		{
			return minimalSt(st1, st2, i1 + 1, i2, st + st1.charAt(i1));
		}
		if (st1.charAt(i1) == st2.charAt(i2))
		{
			return minimalSt(st1, st2, i1 + 1, i2 + 1, st + st1.charAt(i1));
		}

		String s1 = minimalSt(st1, st2, i1 + 1, i2, st + st1.charAt(i1));
		String s2 = minimalSt(st1, st2, i1, i2 + 1, st + st2.charAt(i2));

		if (s1.length() < s2.length())
		{
			return s1;
		}

		return s2;
	}

}
