package com.java.javaapichallenge.orders;

import com.java.javaapichallenge.orders.model.CreateOrderRequest;
import com.java.javaapichallenge.orders.model.OrdersResponse;
import com.java.javaapichallenge.orders.model.UpdateOrderRequest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        return toOrdersResponse(response);
    }

    @Transactional
    public OrdersResponse createNewOrder(CreateOrderRequest request){
        Orders response = new Orders();
        response.setCustomerName(request.getCustomerName());
        response.setTotalAmount(request.getTotalAmount());
        response.setStatus("pending");
        response.setCreatedAt(LocalDateTime.now());
        response.setUpdatedAt(LocalDateTime.now());

        ordersRepository.save(response);

        return toOrdersResponse(response);
    }

    @Transactional
    public OrdersResponse updateOrder(UpdateOrderRequest request, Integer orderId){
        Orders response = ordersRepository.findById(orderId).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        response.setCustomerName(request.getCustomerName());
        response.setTotalAmount(request.getTotalAmount());
        response.setStatus(request.getStatus());
        response.setUpdatedAt(LocalDateTime.now());

        ordersRepository.save(response);

        return toOrdersResponse(response);
    }

    public void deleteOrder(Integer orderId){
       ordersRepository.findById(orderId).
               orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

       ordersRepository.deleteById(orderId);
    }

    public OrdersResponse toOrdersResponse (Orders response){
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
