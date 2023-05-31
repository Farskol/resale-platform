package com.project.spring.restApi.resale_platform.Controller.command.Impl;

import com.project.spring.restApi.resale_platform.Controller.command.ProductCommand;
import com.project.spring.restApi.resale_platform.dto.productDTO.ProductDTO;
import com.project.spring.restApi.resale_platform.dto.productDTO.SaveProductDTO;
import com.project.spring.restApi.resale_platform.mapper.ProductMapper;
import com.project.spring.restApi.resale_platform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductCommandImpl implements ProductCommand {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDTO> getAllProduct() {
        return productService.getAllProduct()
                .stream()
                .map(product -> productMapper.toDTO(product))
                .toList();
    }

    @Override
    public ProductDTO getProduct(int id) {
        return productMapper.toDTO(productService.getProduct(id));
    }

    @Override
    public void saveProduct(SaveProductDTO saveProductDTO) {
        productService.saveProduct(productMapper.toProduct(saveProductDTO));
    }

    @Override
    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }
}
