package com.testsystem.model;

import java.util.UUID;

/**
 * Created by roman.ali on 8/31/2022.
 */
public class Product {

    private String id;
    private String name;
    private String brand;
    private Double price;
    private String sku;

    public Product( String name, String brand, Double price, String sku) {
        super();
        id = UUID.randomUUID().toString();
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.sku = sku;
    }


}
