package com.project.spring.restApi.resale_platform.dto.characteristicDTO;

public class CharacteristicDTO {
    private int id;
    private String name;
    private String description;
    private int productId;

    public CharacteristicDTO() {
    }

    public CharacteristicDTO(int id, String name, String description, int productId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.productId = productId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
