package com.java.javaapichallenge.orders;

import com.java.javaapichallenge.orders.model.OrdersResponse;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }

    @Transactional
    public OrdersResponse getOrderById (Integer orderId) {
        Orders response = ordersRepository.findById(orderId).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return OrdersResponse.builder()
                .id(response.getId())
                .customerName(response.customerName)
                .totalAmount(response.getTotalAmount())
                .status(response.getStatus())
                .createdAt(response.getCreatedAt())
                .updatedAt(response.getUpdatedAt())
                .build();
    }
}
