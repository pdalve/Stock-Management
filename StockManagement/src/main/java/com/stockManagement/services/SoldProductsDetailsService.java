package com.stockManagement.services;

import java.time.LocalDate;

public interface SoldProductsDetailsService {

	public double costPriceofTheSoldProducts(LocalDate date);

	public int quantityOfProductsSold(LocalDate date);

	public double profitEarned(LocalDate date);

	public double profitPercentage(LocalDate date);

}
