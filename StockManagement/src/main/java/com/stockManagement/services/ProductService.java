package com.stockManagement.services;

import java.util.List;

import com.stockManagement.entities.Products;

public interface ProductService {

	public List<Products> displayProducts();

	public void addNewProduct(Products product);

	public void editproduct(Products product, Long productID);

	public List<Products> outOfStock();

}
