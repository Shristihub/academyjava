package com.shristi.productapp.dao;

import java.util.List;

import com.shristi.productapp.model.Product;

public interface IProductDao {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    Product getById(int productId);
    List<Product> getAll();
    List<Product> getByBrand(String brand);
    List<Product> getByCategory(String category);
    List<Product> getByLesserPriceAndCategory(double price, String category);
    
	
}
