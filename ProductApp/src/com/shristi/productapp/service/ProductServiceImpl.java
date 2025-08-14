package com.shristi.productapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.shristi.productapp.dao.IProductDao;
import com.shristi.productapp.dao.ProductDaoImpl;
import com.shristi.productapp.exception.ProductNotFoundException;
import com.shristi.productapp.model.Product;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao = new ProductDaoImpl();

    public void addProduct(Product product) { dao.addProduct(product); }
    public void updateProduct(Product product) { dao.updateProduct(product); }
    public void deleteProduct(int productId) { dao.deleteProduct(productId); }
    public Product getById(int productId) { return dao.getById(productId); }
    public List<Product> getAll() { return dao.getAll(); }

    public List<Product> getByBrand(String brand) {
        List<Product> result = dao.getAll().stream()
            .filter(p -> p.getBrand().equalsIgnoreCase(brand))
            .collect(Collectors.toList());
        if (result.isEmpty()) throw new ProductNotFoundException("No products found for brand: " + brand);
        return result;
    }

    public List<Product> getByCategory(String category) {
        List<Product> result = dao.getAll().stream()
            .filter(p -> p.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.toList());
        if (result.isEmpty()) throw new ProductNotFoundException("No products found for category: " + category);
        return result;
    }

    public List<Product> getByLesserPrice(double price) {
        List<Product> result = dao.getAll().stream()
            .filter(p -> p.getPrice() < price)
            .collect(Collectors.toList());
        if (result.isEmpty()) throw new ProductNotFoundException("No products found below price: " + price);
        return result;
    }
}

