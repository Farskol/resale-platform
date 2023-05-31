package com.project.spring.restApi.resale_platform.dto.productDTO;

import com.project.spring.restApi.resale_platform.dto.characteristicDTO.CharacteristicDTO;

import java.util.List;

public class SaveProductDTO {

    private String name;
    private String type;
    private String description;
    private int salesmanId;
    private List<CharacteristicDTO> characteristics;

    public SaveProductDTO() {
    }

    public SaveProductDTO(String name, String type, String description, int salesmanId, List<CharacteristicDTO> characteristics) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.salesmanId = salesmanId;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(int salesmanId) {
        this.salesmanId = salesmanId;
    }

    public List<CharacteristicDTO> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<CharacteristicDTO> characteristics) {
        this.characteristics = characteristics;
    }
}
