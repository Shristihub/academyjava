package com.util.comp;

public class Product implements Comparable<Product> {

	private String productName;
	private int productId;
	private double price;
	private String category;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, int productId, double price, String category) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int compareTo(Product o) {
		// compare the current objects productName to the productname of the object in
		// the parameter
//		return this.getProductName().compareTo(o.getProductName());

		Double price1 = this.getPrice();
//		return ((Double)o.getPrice()).compareTo(this.getPrice());

		// sorting by price
//		return Double.compare(this.getPrice(), o.getPrice());

//		return Integer.compare(o.getProductId(),this.getProductId());

		int categorysort = this.getCategory().compareTo(o.getCategory());
		int pricesort = Double.compare(this.getPrice(), o.getPrice());
		if (categorysort == 0) {
			if (pricesort == 0) {
				return this.getProductName().compareTo(o.getProductName());
			} else {
				return pricesort;
			}
		} else
			return categorysort;

	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + ", category="
				+ category + "]";
	}

}
