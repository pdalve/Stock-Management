package com.stockManagement.Dao;

import java.util.Date;
import java.util.List;
////

import com.stockManagement.entities.ProductsSalesData;
import com.stockManagement.entities.Sales;
import com.stockManagement.entities.SoldProductsData;

public interface SalesDao {

	public void buyProduct(Sales sales);
	
	public List<ProductsSalesData> SalesDetails(Date date);
	
}
