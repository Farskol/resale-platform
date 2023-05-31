package com.project.spring.restApi.resale_platform.dao;

import com.project.spring.restApi.resale_platform.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProducts();
    void saveProduct(Product product);
    Product getProduct(int id);
    void deleteProduct(int id);
}
