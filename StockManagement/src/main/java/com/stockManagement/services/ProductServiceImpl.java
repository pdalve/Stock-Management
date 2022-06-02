package com.stockManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockManagement.Dao.ProductDao;
import com.stockManagement.entities.Products;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productdao;

	@Override
	public List<Products> displayProducts() {
		List<Products> products = productdao.findAll();

	for (Products p : products) {
		System.out.println(p.getProductName());
		System.out.println(p.getProductCompany());
		System.out.println(p.getProductPrice());
		System.out.println(p.getAvailableStock());
		
	}  return products;
	}

	@Override
	public void addNewProduct(Products product) {
		productdao.addNewProduct(product);

	}

	@Override
	public void editproduct(Products product, Long productID) {
		productdao.editproduct(product, productID);
	}
	
	@Override
	public List<Products> outOfStock() {
		return productdao.outOfStock();
	}
}
