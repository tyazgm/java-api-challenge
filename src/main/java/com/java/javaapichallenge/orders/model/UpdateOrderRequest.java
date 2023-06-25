package com.java.javaapichallenge.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {
    String customerName;
    Double totalAmount;
    String status;
}
