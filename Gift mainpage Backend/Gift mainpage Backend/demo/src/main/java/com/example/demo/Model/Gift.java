package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gift {
    @Id
    private int productId;
    private String name;
    private String productdetails;
    private double amount;
    private String description;
    private String confirmProduct;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductdetails() {
        return productdetails;
    }
    public void setProductdetails(String productdetails) {
        this.productdetails = productdetails;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getConfirmProduct() {
        return confirmProduct;
    }
    public void setConfirmProduct(String confirmProduct) {
        this.confirmProduct = confirmProduct;
    }
    public Gift(int productId, String name, String productdetails, double amount, String description,
            String confirmProduct) {
        this.productId = productId;
        this.name = name;
        this.productdetails = productdetails;
        this.amount = amount;
        this.description = description;
        this.confirmProduct = confirmProduct;
    }
    public Gift() {
    }

}