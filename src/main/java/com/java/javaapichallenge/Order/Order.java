package com.java.javaapichallenge.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table
public class Order {
    Integer id;
    String customer_name;
    Float total_amount;
    String status;
    Timestamp created;
    Timestamp updated_at;

    public Order(){

    }
    public Order(Integer id, String customer_name, Float total_amount, String status, Timestamp created, Timestamp updated_at) {
        this.id = id;
        this.customer_name = customer_name;
        this.total_amount = total_amount;
        this.status = status;
        this.created = created;
        this.updated_at = updated_at;
    }

    public Order(String customer_name, Float total_amount, String status, Timestamp created, Timestamp updated_at) {
        this.customer_name = customer_name;
        this.total_amount = total_amount;
        this.status = status;
        this.created = created;
        this.updated_at = updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Float total_amount) {
        this.total_amount = total_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
