package com.stockManagement.entities;

import java.sql.Date;

public class Sales {
	private int productID;

	public Sales(int productID, int soldProducts, Long sellingPrice, Date dateOfSale) {
		super();
		this.productID = productID;
		this.soldProducts = soldProducts;
		this.sellingPrice = sellingPrice;
		this.dateOfSale = dateOfSale;
	}

	private int soldProducts;
	
	private Long sellingPrice;

	private Date dateOfSale;

	@Override
	public String toString() {
		return "Sales [productID=" + productID + ", soldProducts=" + soldProducts + ", sellingPrice=" + sellingPrice
				+ ", dateOfSale=" + dateOfSale + "]";
	}

	

	
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getSoldProducts() {
		return soldProducts;
	}

	public void setSoldProducts(int soldProducts) {
		this.soldProducts = soldProducts;
		
	}

	public Long getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Long sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}




}