package com.hansanhha.spring.shop;

import com.hansanhha.spring.shop.order.Order;
import com.hansanhha.spring.shop.order.OrderManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ConfigurationPropertiesScan
public class ModulithApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulithApplication.class, args)
                .getBean(OrderManagement.class)
                .request(new Order());
    }
}
