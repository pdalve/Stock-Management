package com.stockManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockManagement.entities.Products;
import com.stockManagement.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Products> displayProducts() {
		return productService.displayProducts();
	}

	@PostMapping("/products")
	public void addNewProduct(@RequestBody Products product) {
		productService.addNewProduct(product);
	}

	@PutMapping("/products/{productid}")
	public void editproduct(@PathVariable("productid") Long productID, @RequestBody Products product) {
		productService.editproduct(product, productID);
	}

	@GetMapping("/productsoutofstock")
	public List<Products> productsOutOfStock() {
		return productService.outOfStock();
	}

}
