import java.util.LinkedList;

public class Company
{
	private TreeSet<Product> products;
	private String name;

	public Company(String name)
	{
		products = new TreeSet<>();
		setName("IBM");
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
