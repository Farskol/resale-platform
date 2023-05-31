package com.project.spring.restApi.resale_platform.service.impl;

import com.project.spring.restApi.resale_platform.dao.ProductDAO;
import com.project.spring.restApi.resale_platform.entity.Product;
import com.project.spring.restApi.resale_platform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getAllProduct() {
        return productDAO.getAllProducts();
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
