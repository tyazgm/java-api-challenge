package com.java.javaapichallenge.orders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
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
                    LocalDate.now(),
                    LocalDate.now()
            );

            ordersRepository.saveAll(
                    List.of(john)
            );
        };
    }
}
