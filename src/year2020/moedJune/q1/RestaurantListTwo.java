package year2020.moedJune.q1;

public class RestaurantListTwo
{
	private RestaurantNodeTwo _head;
	private RestaurantNodeTwo _tail;

	public RestaurantListTwo()
	{
		_head = _tail = null;
	}

	public void addFood(String food)
	{
		if (_head == null)
		{
			_head = _tail = new RestaurantNodeTwo(food);
		}
		else
		{
			_tail.setNext(new RestaurantNodeTwo(food));
			_tail = _tail.getNext();
		}
	}

	public int findMinDiff(String x, String y)
	{
		RestaurantNodeTwo curr = _head;
		int index = 0;
		int lastX = -1;
		int lastY = -1;
		int distance = Integer.MAX_VALUE;
		while (curr != null)
		{

			if (curr.getFood().equals(x))
			{
				lastX = index;
				if (lastY > -1)
				{
					distance = Math.min(distance, lastX - lastY);
				}
			}
			if (curr.getFood().equals(y))
			{
				lastY = index;
				if (lastX > -1)
				{
					distance = Math.min(distance, lastY - lastX);
				}
			}

			index++;
			curr = curr.getNext();
		}

		return distance;
	}

	public String toString()
	{
		String str = "null<-" + _head;
		RestaurantNodeTwo curr = _head.getNext();
		while (curr != null)
		{
			str += "<-->" + curr.toString();
			curr = curr.getNext();
		}
		str += "->null";
		return str;
	}

}
