package year2022.moed96;

public class Q1
{
	public static int calc(int num, int result, int maxOp)
	{
		return calc(num, result, maxOp, num, "" + num);
	}

	private static int calc(int num, int result, int maxOp, int currVal, String exStr)
	{
		if (maxOp < 0)
		{
			return 0;
		}
		if (currVal == result)
		{
			System.out.println(exStr + "=" + result);
			return 1;
		}

		return calc(num, result, maxOp - 1, currVal + num, exStr + "+" + num) +
				calc(num, result, maxOp - 1, currVal - num, exStr + "-" + num)+
				calc(num, result, maxOp - 1, currVal * num, exStr + "*" + num)+
				calc(num, result, maxOp - 1, currVal / num, exStr + "/" + num);
	}

}
