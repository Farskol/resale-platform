package com.project.spring.restApi.resale_platform.Controller.command;

import com.project.spring.restApi.resale_platform.dto.productDTO.ProductDTO;
import com.project.spring.restApi.resale_platform.dto.productDTO.SaveProductDTO;

import java.util.List;

public interface ProductCommand {
    List<ProductDTO> getAllProduct();
    ProductDTO getProduct(int id);
    void saveProduct(SaveProductDTO saveProductDTO);
    void deleteProduct(int id);
}
