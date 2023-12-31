package com.java.javaapichallenge.orders.repository;

import com.java.javaapichallenge.orders.entity.Orders;
import com.java.javaapichallenge.orders.model.OrdersResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
