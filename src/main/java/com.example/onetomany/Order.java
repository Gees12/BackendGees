package com.example.onetomany;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // getter setter

    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}