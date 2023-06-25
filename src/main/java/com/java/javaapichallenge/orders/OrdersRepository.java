package com.java.javaapichallenge.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    Optional<Orders> findFirstById(Integer ordersId);

}
