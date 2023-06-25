package com.java.javaapichallenge.orders.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("customer_name")
    String customerName;

    @JsonProperty("total_amount")
    Double totalAmount;

    String status;

    @JsonProperty("created_at")
    LocalDateTime createdAt;

    @JsonProperty("updated_at")
    LocalDateTime updatedAt;

    public OrdersResponse(String customerName,
                          Double totalAmount,
                          String status,
                          LocalDateTime createdAt,
                          LocalDateTime updatedAt) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
