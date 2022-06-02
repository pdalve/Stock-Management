package com.stockManagement.Dao;

import java.util.Date;
import java.util.List;

import com.stockManagement.entities.ProductsProductData;
import com.stockManagement.entities.Products;

public interface ProductDao {

	public List<Products> findAll();

	public int find(int productID);

	public void addNewProduct(Products product);

	public void editproduct(Products product, Long productID);

	public void editproductStock(int productId );

	public List<Products> outOfStock();
	
	//public List<ProductsProductData> productsProductData(Date date, List<Integer> productIds);

}
