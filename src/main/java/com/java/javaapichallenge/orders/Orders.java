package com.java.javaapichallenge.orders;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Orders {

    @Id
    @SequenceGenerator(
            name = "orders_sequence",
            sequenceName = "orders_sequnce",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orders_sequence"
    )
    Integer id;

    @Column(name = "customer_name")
    String customerName;

    @Column(name = "total_amount")
    Double totalAmount;
    String status;

    @Column(name = "created_at")
    LocalDate createdAt;

    @Column(name = "updated_at")
    LocalDate updatedAt;

    public Orders(){

    }

    public Orders(Integer id, String customerName, Double totalAmount, String status, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Orders(String customerName, Double totalAmount, String status, LocalDate createdAt, LocalDate updatedAt) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
