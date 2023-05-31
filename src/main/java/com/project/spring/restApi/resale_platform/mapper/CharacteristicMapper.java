package com.project.spring.restApi.resale_platform.mapper;

import com.project.spring.restApi.resale_platform.dto.characteristicDTO.CharacteristicDTO;
import com.project.spring.restApi.resale_platform.entity.Characteristic;
import com.project.spring.restApi.resale_platform.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class CharacteristicMapper {

    public CharacteristicDTO toDTO(Characteristic characteristic){
        return new CharacteristicDTO(characteristic.getId(), characteristic.getName(), characteristic.getDescription(),characteristic.getProduct().getId());
    }

    public Characteristic toCharacteristic(CharacteristicDTO characteristicDTO){
        return new Characteristic(
                characteristicDTO.getName(),
                characteristicDTO.getDescription(),
                new Product(characteristicDTO.getProductId())
        );
    }
}
