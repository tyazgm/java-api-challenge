package com.java.javaapichallenge.orders;

import com.java.javaapichallenge.orders.model.OrdersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public  OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Orders> getOrders(){
        return ordersService.getOrders();
    }

    @GetMapping(path = "{orderId}")
    public Optional<OrdersResponse> getOrderById(@PathVariable("orderId") Integer orderId){
        return ordersService.getOrderById(orderId);
    }


}
