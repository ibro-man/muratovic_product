
public class Product
{
	private String name;
	private float price;
	private boolean onStock;

	public Product(String name)
	{
		setName("Coca Cola");
		setPrice(10);
		setOnStock(true);
	}
	public int getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public boolean getOnStock()
	{
		return onStock;
	}

	public void setOnStock(boolean onstock)
	{
		this.onStock = onstock;
	}



}
