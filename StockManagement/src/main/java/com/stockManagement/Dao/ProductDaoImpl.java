package com.stockManagement.Dao;

//pooja

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.stockManagement.entities.ProductsProductData;
import com.stockManagement.entities.Products;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Products> findAll() {

		List<Products> products = jdbcTemplate.query("SELECT * FROM Products", new RowMapper<Products>() {
	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Products(rs.getInt("productID"), rs.getString("productName"),rs.getString("productCompany"), 
				rs.getLong("productPrice"), rs.getLong("availableStocks"));
			}

		});
		return products;
	}
	
	
	
	
	

	@Override
	public void addNewProduct(Products product) {
		String query = " INSERT INTO Products (productName, productCompany, productPrice, availableStocks) values(?,?,?,?)";
		Object[] property = { product.getProductName(), product.getProductCompany(), product.getProductPrice(),
				product.getAvailableStock() };
		jdbcTemplate.update(query, property);

	}
	@Override
	public void editproduct(Products product, Long productID) {
		String query = " UPDATE  Products SET productName=?, productCompany=?, productPrice=? Where productID = ?  ";

		Object[] property = new Object[] { product.getProductName(), product.getProductCompany(),
				product.getProductPrice(), productID };
		//int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.INTEGER };
		jdbcTemplate.update(query, property);
	}

	@Override
	public void editproductStock(int productID ) {
		String query = " UPDATE  Products SET availableStocks= availableStocks - 1 Where productID = ?";

		Object[] property = new Object[] {  productID };
		//int[] types = new int[] {  Types.INTEGER };
		jdbcTemplate.update(query, property);
	}

	public int find(int productID) {

		Object[] property = new Object[] { productID };
		int[] types = new int[] { Types.INTEGER };
		List<Products> products = jdbcTemplate.query("SELECT * FROM Products where productID = ?", property, types,
		new RowMapper<Products>() {
		@Override
		public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Products(rs.getInt("Product_ID"), rs.getString("productName"),
		rs.getString("productCompany"), rs.getLong("productPrice"),rs.getLong("availableStocks"));
					}

				});
		return products.size();
	}

	@Override
	public List<Products> outOfStock() {
		List<Products> products = jdbcTemplate.query("SELECT * FROM Products where availableStocks < 3",
			new RowMapper<Products>() {
	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
	    return new Products(rs.getInt("productID"), rs.getString("productName"),
		rs.getString("productCompany"), rs.getLong("productPrice"),rs.getLong("availableStocks"));
					}

				});
		return products;

	}

	/*
	 * @Override public List<ProductsProductData> productsProductData(Date date,
	 * List<Integer> productIds) {
	 * 
	 * String stringProductIds =
	 * productIds.stream().map(String::valueOf).collect(Collectors.joining(","));
	 * 
	 * List<ProductsProductData> products = jdbcTemplate.
	 * query("select  product_id, product_company, product_price as costPriceProducts from products where product_id in ("
	 * + stringProductIds + ")",
	 * 
	 * new RowMapper<ProductsProductData>() {
	 * 
	 * @Override public ProductsProductData mapRow(ResultSet rs, int rowNum) throws
	 * SQLException { return new ProductsProductData(rs.getInt("product_id"),
	 * rs.getString("product_company"),rs.getInt("costPriceProducts")); }
	 * 
	 * }); return products; }
	 */

}
