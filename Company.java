import java.util.ArrayList;

public class Company 
{
	private ArrayList<Product> products;
	private String name;
	
	public Company(String name)
	{
		products = new ArrayList<>();
		this.name = name;
	}
}
