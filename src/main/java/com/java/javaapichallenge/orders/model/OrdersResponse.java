package com.java.javaapichallenge.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersResponse {
    Integer id;
    String customerName;
    Double totalAmount;
    String status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
