package org.sliit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    private int id;
    private String productName;
    private double price;

    public Product() {

    }
}
