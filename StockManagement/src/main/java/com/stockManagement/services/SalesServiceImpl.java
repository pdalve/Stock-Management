package com.stockManagement.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockManagement.Dao.ProductDao;
import com.stockManagement.Dao.SalesDao;
import com.stockManagement.entities.Products;
import com.stockManagement.entities.ProductsProductData;
import com.stockManagement.entities.ProductsSalesData;
import com.stockManagement.entities.Sales;
import com.stockManagement.entities.SoldProductsData;

@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SalesDao salesDao;

	@Autowired
	private ProductDao productDao;

	@Override
	public void buyProduct(Sales sales) {
		if (productDao.find(sales.getProductID()) == 1) {
			salesDao.buyProduct(sales);
			productDao.editproductStock(sales.getProductID());
			return;
		} else {
			System.out.println("Invalid Product ID..");
			return;
		}

	}

	@Override
	public List<ProductsSalesData> SalesDetails(Date date) {

		return salesDao.SalesDetails(date);

	}
	
	/*
	 * for (SoldProductsData p : products) { System.out.println(p.getProductID());
	 * System.out.println(p.getProductName());
	 * System.out.println(p.getCostPriceofTheSoldProducts ());
	 * System.out.println(p.getQuantityOfProductsSold());
	 * System.out.println(p.getProfitEarned());
	 * System.out.println(p.getProfitPercentage());
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * List<Integer> productIds = new ArrayList<Integer>();
	 * 
	 * 
	 * 
	 * for(ProductsSalesData data : productsSalesData) {
	 * productIds.add(data.getProductId()); }
	 * 
	 * List<ProductsProductData> productsProductDataList =
	 * productDao.productsProductData(date, productIds);
	 * 
	 * 
	 * Map<Integer, ProductsProductData> productsProductDataMap =
	 * productsProductDataList.stream().collect(Collectors.toMap(ProductsProductData
	 * ::getProductId, Function.identity()));
	 * 
	 * List<SoldProductsData> soldProductsList = new ArrayList<SoldProductsData>();
	 * 
	 * for(ProductsSalesData data : productsSalesData) { SoldProductsData
	 * soldProducts= new SoldProductsData();
	 * 
	 * soldProducts.setProductId(data.getProductId());
	 * 
	 * soldProducts.setProfitEarned(data.getProfitEarned());
	 * 
	 * soldProducts.setQuantityOfProductsSold(data.getQuantityOfProductsSold());
	 * 
	 * ProductsProductData productsProductData =
	 * productsProductDataMap.get(data.getProductId());
	 * 
	 * soldProducts.setProductCompany(productsProductData.getProductCompany());
	 * 
	 * soldProducts.setCostPriceofTheSoldProducts(
	 * productsProductData.getCostPriceProducts() *
	 * data.getQuantityOfProductsSold());
	 * 
	 * soldProducts.setProfitPercentage((data.getProfitEarned()/
	 * productsProductData.getCostPriceProducts())*100);
	 * 
	 * soldProductsList.add(soldProducts); }
	 * 
	 * return soldProductsList;
	 */
	 

}