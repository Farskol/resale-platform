package com.project.spring.restApi.resale_platform.mapper;

import com.project.spring.restApi.resale_platform.dto.productDTO.ProductDTO;
import com.project.spring.restApi.resale_platform.dto.productDTO.SaveProductDTO;
import com.project.spring.restApi.resale_platform.entity.Characteristic;
import com.project.spring.restApi.resale_platform.entity.Product;
import com.project.spring.restApi.resale_platform.entity.Salesman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {

    @Autowired
    private CharacteristicMapper characteristicMapper;
    public ProductDTO toDTO(Product product){
        if(product != null){//todo
            List<Integer> characteristicId = product.getCharacteristics()
                    .stream()
                    .map(Characteristic::getId)
                    .toList();
            return new ProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getType(),
                    product.getDescription(),
                    product.getSalesman().getId(),
                    characteristicId
            );
        }else {
            return null;
        }
    }

    public Product toProduct(SaveProductDTO saveProductDTO){
        List<Characteristic> characteristics = saveProductDTO.getCharacteristics()
                .stream()
                .map(characteristicDTO -> characteristicMapper.toCharacteristic(characteristicDTO))
                .toList();
        return new Product(
                saveProductDTO.getName(),
                saveProductDTO.getType(),
                saveProductDTO.getDescription(),
                new Salesman(saveProductDTO.getSalesmanId()),
                characteristics
        );
    }
}
