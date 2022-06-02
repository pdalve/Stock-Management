package com.stockManagement.entities;

public class SoldProductsData {

	private String productCompany;
	private int productId;
	private int costPriceofTheSoldProducts;
	private int quantityOfProductsSold;
	private int profitEarned;
	private double profitPercentage;

	public SoldProductsData( ) {
	}
	
	public SoldProductsData(int productId, int costPriceofTheSoldProducts, int quantityOfProductsSold) {
		this.productId = productId;
		this.costPriceofTheSoldProducts = costPriceofTheSoldProducts;
		this.quantityOfProductsSold = quantityOfProductsSold;
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

	public int getCostPriceofTheSoldProducts() {
		return costPriceofTheSoldProducts;
	}

	public void setCostPriceofTheSoldProducts(int costPriceofTheSoldProducts) {
		this.costPriceofTheSoldProducts = costPriceofTheSoldProducts;
	}

	public int getQuantityOfProductsSold() {
		return quantityOfProductsSold;
	}

	public void setQuantityOfProductsSold(int quantityOfProductsSold) {
		this.quantityOfProductsSold = quantityOfProductsSold;
	}

	public int getProfitEarned() {
		return profitEarned;
	}

	public void setProfitEarned(int profitEarned) {
		this.profitEarned = profitEarned;
	}

	public double getProfitPercentage() {
		return profitPercentage;
	}

	public void setProfitPercentage(double profitPercentage) {
		this.profitPercentage = profitPercentage;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	

}
