package com.java.javaapichallenge.orders.controller;

import com.java.javaapichallenge.orders.service.OrdersService;
import com.java.javaapichallenge.orders.entity.Orders;
import com.java.javaapichallenge.orders.model.CreateOrderRequest;
import com.java.javaapichallenge.orders.model.OrdersResponse;
import com.java.javaapichallenge.orders.model.UpdateOrderRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public  OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping(
            path = "/orders",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<OrdersResponse> getOrders(){
        return ordersService.getOrders();
    }

    @GetMapping(
            path = "/orders/{Id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrdersResponse getOrderById(@PathVariable("Id") Integer orderId){
        return ordersService.getOrderById(orderId);
    }

    @PostMapping(
            path = "/orders",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrdersResponse createNewOrder(@RequestBody CreateOrderRequest request,
                                         HttpServletResponse responseCode){
        responseCode.setStatus(HttpServletResponse.SC_CREATED);
        return ordersService.createNewOrder(request);
    }

    @PutMapping(
            path = "/orders/{Id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public OrdersResponse updateOrder(@RequestBody UpdateOrderRequest request,
                                      @PathVariable("Id") Integer orderId){
        return ordersService.updateOrder(request, orderId);
    }

    @DeleteMapping(
            path = "/orders/{Id}"
    )
    public void deleteOrder(@PathVariable("Id")Integer orderId,
                            HttpServletResponse responseCode){
        responseCode.setStatus(HttpServletResponse.SC_NO_CONTENT);
        ordersService.deleteOrder(orderId);
    }

}
