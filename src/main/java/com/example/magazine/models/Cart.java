package com.example.magazine.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {
@Id
    private Long id;
    private String productTitle;
    private Integer productPrice;

    public Cart(String productTitle, Integer productPrice) {
        this.productTitle = productTitle;
        this.productPrice = productPrice;
    }
    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productTitle='" + productTitle + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }
}
