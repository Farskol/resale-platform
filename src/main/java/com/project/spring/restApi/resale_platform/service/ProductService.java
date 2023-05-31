package com.project.spring.restApi.resale_platform.service;

import com.project.spring.restApi.resale_platform.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    void saveProduct(Product product);
    Product getProduct(int id);
    void deleteProduct(int id);
}
