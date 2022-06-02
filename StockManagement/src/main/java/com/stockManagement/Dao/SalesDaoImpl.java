package com.stockManagement.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.stockManagement.entities.ProductsSalesData;
import com.stockManagement.entities.Sales;

@Repository
public class SalesDaoImpl implements SalesDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void buyProduct(Sales sales) {

		String query = " INSERT INTO Sales (productID, soldProducts, sellingPrice, dateOfSale) values(?,?,?,?)";
		Object[] property = { sales.getProductID(), sales.getSoldProducts(), sales.getSellingPrice(), sales.getDateOfSale()
				 };
		jdbcTemplate.update(query, property);
	}

	@Override
	public List<ProductsSalesData> SalesDetails(Date date) {
		 StringBuilder query = new StringBuilder("SELECT Products.productID, Products.productCompany");
		 query.append("sum( Sales.soldProducts) AS QuantityOfProductsSold");
		 query.append("sum(Sales.soldProducts* Products.ProductPrice ) AS CostPriceofTheSoldProducts");
		 query.append("Sum(Sales.sellingPrice) -CostPriceofTheSoldProducts) AS ProfitEarned");
		 query.append("ProfitEarned/CostPriceofTheSoldProducts)*100 ) AS ProfitPercentage");
		 query.append("FROM Products INNER JOIN Sales ON Products.ProductID= Sales.productID");
		 query.append("where Sales.dateOfSale= ?");
		 query.append("GROUP BY Products.productID, Products.productCompany");
		Object[] property = new Object[] { date };
		//int[] types = new int[] { Types.DATE };
		@SuppressWarnings("deprecation")
		List<ProductsSalesData> products = jdbcTemplate.query(query.toString(), property,  
					new RowMapper<ProductsSalesData>() {
					
		@Override			
		public ProductsSalesData mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ProductsSalesData(rs.getInt("productId"), rs.getString("productCompany"),
		rs.getInt("quantityOfProductsSold"),rs.getDouble("CostPriceofTheSoldProducts"),rs.getDouble("ProfitEarned"),rs.getDouble("ProfitEarned"));
					}

				});
		return products;
	


	}

}
