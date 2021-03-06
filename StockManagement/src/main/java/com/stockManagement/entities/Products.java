package com.stockManagement.entities;

public class Products {

	private int productID;
	private String productName;
	private String productCompany;
	private Long productPrice;
	private Long availableStock;

	public Products(int productID, String productName, String productCompany, Long productPrice, Long availableStock) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCompany = productCompany;
		this.productPrice = productPrice;
		this.availableStock = availableStock;
	}

	public Products(String productName, String productCompany, Long productPrice) {
		super();

		this.productName = productName;
		this.productCompany = productCompany;
		this.availableStock = productPrice;
	}

	public Products() {
		super();
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}

	public Long getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(Long availableStock) {
		this.availableStock = availableStock;
	}

	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productCompany="
				+ productCompany + ", productPrice=" + productPrice + ", availableStock=" + availableStock + "]";
	}

}
