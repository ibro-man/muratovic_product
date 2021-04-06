package model;

import java.util.ArrayList;

public class Company 
{
	private ArrayList<Product> products;
	private String name;
	private boolean onStock;
	
	public Company()
	{
		products = new ArrayList<>();
		setName("IBM");
		setOnStock(true);
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOnStock() {
		return onStock;
	}

	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
	}
	
	
}
