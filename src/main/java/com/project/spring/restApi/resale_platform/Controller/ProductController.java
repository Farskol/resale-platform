package com.project.spring.restApi.resale_platform.Controller;

import com.project.spring.restApi.resale_platform.Controller.command.ProductCommand;
import com.project.spring.restApi.resale_platform.dto.productDTO.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductCommand productCommand;

    @GetMapping("")
    public List<ProductDTO> getAllProduct(){
        return productCommand.getAllProduct();
    }

    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable int id){
        return productCommand.getProduct(id);
    }
}
