package com.java.javaapichallenge.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public  OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> getStudents(){
        return ordersService.getOrders();
    }
}
