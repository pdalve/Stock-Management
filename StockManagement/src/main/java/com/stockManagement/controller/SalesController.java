package com.stockManagement.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stockManagement.entities.ProductsSalesData;
import com.stockManagement.entities.Sales;
import com.stockManagement.entities.SoldProductsData;
import com.stockManagement.services.SalesService;

@RestController
public class SalesController {

	@Autowired
	private SalesService salesService;

	@PostMapping("/sales")
	public void buyProduct(@RequestBody Sales sales) {
		salesService.buyProduct(sales);
	}
	
	@JsonFormat
	@GetMapping("/salesdetails")
	public List<ProductsSalesData> SalesDetails(@RequestParam(name="date")@JsonFormat String date)  {
		
		
		return salesService.SalesDetails(new Date());
	} 

}
