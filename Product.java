
public class Product 
{
	private String name;
	private float price;

	public Product(String name) 
	{
		setName("Coca Cola");
		setPrice(10);
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
	
	
	
}
