package com.project.spring.restApi.resale_platform.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "characteristics")
public class Characteristic {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    public Characteristic() {
    }

    public Characteristic(int id) {
        this.id = id;
    }

    public Characteristic(String name, String description, Product product) {
        this.name = name;
        this.description = description;
        this.product = product;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
