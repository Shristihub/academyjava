package com.shristi.productapp.dao;

import com.shristi.productapp.model.Product;
import com.shristi.productapp.exception.ProductNotFoundException;
import java.sql.*;
import java.util.*;

public class ProductDaoImpl implements IProductDao {
    private static final String URL = "jdbc:mysql://localhost:3306/yourdb";
    private static final String USER = "root";
    private static final String PASS = "password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public void addProduct(Product product) {
        String sql = "INSERT INTO product VALUES (?, ?, ?, ?, ?)";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setDouble(3, product.getPrice());
            ps.setString(4, product.getBrand());
            ps.setString(5, product.getCategory());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(Product product) {
        String sql = "UPDATE product SET productName=?, price=?, brand=?, category=? WHERE productId=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, product.getProductName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getBrand());
            ps.setString(4, product.getCategory());
            ps.setInt(5, product.getProductId());
            if (ps.executeUpdate() == 0) throw new ProductNotFoundException("Product not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(int productId) {
        String sql = "DELETE FROM product WHERE productId=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, productId);
            if (ps.executeUpdate() == 0) throw new ProductNotFoundException("Product not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Product getById(int productId) {
        String sql = "SELECT * FROM product WHERE productId=?";
        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5));
            } else {
                throw new ProductNotFoundException("Product not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product";
        try (Connection con = getConnection(); Statement st = con.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

	@Override
	public List<Product> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategory(String category) {
		 List<Product> productsByCategory = new ArrayList<>();
	        String sql = "SELECT * FROM product where category = ?";
	        try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setString(1, category);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5)));
	            }
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        if (productsByCategory.isEmpty()) {
	            throw new ProductNotFoundException("No products found for category: " + category);
	        }
		return productsByCategory;
	}

	@Override
	public List<Product> getByLesserPriceAndCategory(double price, String category) {
		List<Product> productsByPriceAndCategory = new ArrayList<>();
		String sql = "SELECT * FROM product WHERE price < ? AND category = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setDouble(1, price);
			ps.setString(2, category);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				productsByPriceAndCategory.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		if (productsByPriceAndCategory.isEmpty()) {
			throw new ProductNotFoundException("No products found below price: " + price + " in category: " + category);
		}
		return productsByPriceAndCategory;
	}
}
