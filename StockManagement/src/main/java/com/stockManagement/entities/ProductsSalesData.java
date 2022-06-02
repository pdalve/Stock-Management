package com.stockManagement.entities;

public class ProductsSalesData {
	private int productId;
	private String productCompany;
	private double costPriceofTheSoldProducts;
	private double quantityOfProductsSold;
	private double profitEarned;
	private double profitPercentage;

	public ProductsSalesData(int productId, String productCompany, double costPriceofTheSoldProducts,
			double quantityOfProductsSold, double profitEarned, double profitPercentage) {
		super();
		this.productId = productId;
		this.productCompany = productCompany;
		this.costPriceofTheSoldProducts = costPriceofTheSoldProducts;
		this.quantityOfProductsSold = quantityOfProductsSold;
		this.profitEarned = profitEarned;
		this.profitPercentage = profitPercentage;
	}
	@Override
	public String toString() {
		return "ProductsSalesData [productId=" + productId + ", productCompany=" + productCompany
				+ ", costPriceofTheSoldProducts=" + costPriceofTheSoldProducts + ", quantityOfProductsSold="
				+ quantityOfProductsSold + ", profitEarned=" + profitEarned + ", profitPercentage=" + profitPercentage
				+ "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCompany() {
		return productCompany;
	}
	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}
	public double getCostPriceofTheSoldProducts() {
		return costPriceofTheSoldProducts;
	}
	public void setCostPriceofTheSoldProducts(double costPriceofTheSoldProducts) {
		this.costPriceofTheSoldProducts = costPriceofTheSoldProducts;
	}
	public double getQuantityOfProductsSold() {
		return quantityOfProductsSold;
	}
	public void setQuantityOfProductsSold(double quantityOfProductsSold) {
		this.quantityOfProductsSold = quantityOfProductsSold;
	}
	public double getProfitEarned() {
		return profitEarned;
	}
	public void setProfitEarned(double profitEarned) {
		this.profitEarned = profitEarned;
	}
	public double getProfitPercentage() {
		return profitPercentage;
	}
	public void setProfitPercentage(double profitPercentage) {
		this.profitPercentage = profitPercentage;
	}
	
	
	
}

	