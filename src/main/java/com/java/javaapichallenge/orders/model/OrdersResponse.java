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
    private Integer id;

    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("total_amount")
    private Double totalAmount;

    private String status;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

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
