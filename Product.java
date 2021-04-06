package model;

import java.util.TreeSet;

public class Product 
{
	private String name;
	private TreeSet<Product> products;
	
	public Product(String name, TreeSet<Product> products) {
		super();
		this.name = name;
		this.products = products;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public TreeSet<Product> getProducts() {
		return products;
	}

	public void setProducts(TreeSet<Product> products) {
		this.products = products;
	}
		
}
