package com.example.consumerapi.entities;

public class Product {
    private Long id;
    private String name;
    private Double price;

    public Product (){}

    public Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(Product objProduct, Product objPrice) {
        this.id = objProduct.getId();
        this.name = objProduct.getName();
        this.price = objPrice.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


