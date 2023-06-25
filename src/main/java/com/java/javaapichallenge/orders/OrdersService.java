package com.java.javaapichallenge.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return  ordersRepository.findAll();
    }

    public Optional<Orders> getOrderById(Integer orderId) {
        boolean isExist = ordersRepository.existsById(orderId);

        if (!isExist){
            throw new IllegalStateException(
                    "order with id " + orderId + " does not exists"
            );
        }
        return ordersRepository.findById(orderId);
    }
}
