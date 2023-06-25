package com.java.javaapichallenge.orders.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersResponse {
    Integer id;
    String customerName;
    Double totalAmount;
    String status;
    LocalDate createdAt;
    LocalDate updatedAt;
}
