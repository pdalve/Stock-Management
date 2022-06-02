package com.stockManagement.entities;

public class ProductsProductData {

	private String productCompany;
	
	private int productId;
	
	private int costPriceProducts;
	
	public ProductsProductData( ) {
	}
	
	public ProductsProductData(int productId, String productCompany, int costPriceProducts) {
		this.productId = productId;
		this.productCompany = productCompany;
		this.costPriceProducts = costPriceProducts;
	}
	public String getProductCompany() {
		return productCompany;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCostPriceProducts() {
		return costPriceProducts;
	}

	public void setCostPriceProducts(int costPriceProducts) {
		this.costPriceProducts = costPriceProducts;
	}
	
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	

}
