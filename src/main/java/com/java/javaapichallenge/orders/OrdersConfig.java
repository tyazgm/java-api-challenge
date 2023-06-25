package com.java.javaapichallenge.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Configuration
public class OrdersConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            OrdersRepository ordersRepository){
        return args -> {
            Orders john = new Orders(
                    "John Doe",
                    50.99,
                    "completed",
                    LocalDateTime.now(),
                    LocalDateTime.now()
            );

            Orders jane = new Orders(
                    "Jane Smith",
                    25.5,
                    "pending",
                    LocalDateTime.now(),
                    LocalDateTime.now()
            );

            ordersRepository.saveAll(
                    List.of(john, jane)
            );
        };
    }
}
