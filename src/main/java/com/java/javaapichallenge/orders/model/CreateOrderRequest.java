package com.java.javaapichallenge.orders.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequest {
    @JsonProperty("customer_name")
    private String customerName;

    @JsonProperty("total_amount")
    private Double totalAmount;
}
