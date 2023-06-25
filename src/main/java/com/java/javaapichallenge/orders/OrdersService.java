package com.java.javaapichallenge.orders;

import com.java.javaapichallenge.orders.model.OrdersResponse;
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

    public Optional<OrdersResponse> getOrderById(Integer orderId) {
//        boolean isExist = ordersRepository.existsById(orderId);
//
//        if (!isExist){
//            throw new IllegalStateException(
//                    "order with id " + orderId + " does not exists"
//            );
//        }

        Orders request = ordersRepository.findById(orderId).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        OrdersResponse response = new OrdersResponse(
                request.getId(),
                request.getCustomerName(),
                request.getTotalAmount(),
                request.getStatus(),
                request.getCreatedAt(),
                request.getUpdatedAt()
        );

        return Optional.of(response);
    }
}
