package com.java.javaapichallenge.orders;

import com.java.javaapichallenge.orders.model.CreateOrderRequest;
import com.java.javaapichallenge.orders.model.OrdersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public OrdersResponse getOrderById(@PathVariable("orderId") Integer orderId){
        return ordersService.getOrderById(orderId);
    }

    @PostMapping
    public OrdersResponse createNewOrder(@RequestBody CreateOrderRequest request){
        return ordersService.createNewOrder(request);
    }

}
