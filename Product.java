
public class Product
{
	private String name;
	private float price;
	private int id;

	public Product(String name)
	{
		setName("Coca Cola");
		setPrice(10);
		setId(id);
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

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}



}
