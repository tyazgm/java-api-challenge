package com.java.javaapichallenge.Order;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Orders {

    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequnce",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )

    Integer id;
    String customer_name;
    Double total_amount;
    String status;
    LocalDate created_at;
    LocalDate updated_at;

    public Orders(){

    }

    public Orders(Integer id, String customer_name, Double total_amount, String status, LocalDate created_at, LocalDate updated_at) {
        this.id = id;
        this.customer_name = customer_name;
        this.total_amount = total_amount;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Orders(String customer_name, Double total_amount, String status, LocalDate created_at, LocalDate updated_at) {
        this.customer_name = customer_name;
        this.total_amount = total_amount;
        this.status = status;
        this.created_at = created_at;
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

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public LocalDate getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDate updated_at) {
        this.updated_at = updated_at;
    }
}
