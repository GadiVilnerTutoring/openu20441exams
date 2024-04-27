package year2020.moedJune.q1;

public class RestaurantNodeTwo
{
	private RestaurantNodeTwo next;
	private RestaurantNodeTwo prev;
	private String food;

	public RestaurantNodeTwo(String food)
	{
		this.food = food;
		next = prev = null;
	}

	public RestaurantNodeTwo getNext()
	{
		return next;
	}

	public void setNext(RestaurantNodeTwo node)
	{
		next = node;
	}

	public RestaurantNodeTwo getPrev()
	{
		return prev;
	}

	public void setPrev(RestaurantNodeTwo prev)
	{
		this.prev = prev;
	}

	public void setFood(String food)
	{
		this.food = food;
	}

	public String getFood()
	{
		return food;
	}

	@Override
	public String toString()
	{
		return food;
	}

}
