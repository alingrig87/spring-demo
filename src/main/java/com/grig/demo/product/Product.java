package com.grig.demo.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Product {
    private long id;
    private String name;
    private Double price;
    private String description;
    private String imageURL;

    public Product(long id, String name, Double price, String description, String imageURL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageURL = imageURL;
    }

    public Product( String name, Double price, String description, String imageURL) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageURL = imageURL;
    }

}
