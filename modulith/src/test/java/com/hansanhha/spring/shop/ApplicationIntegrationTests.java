package com.hansanhha.spring.shop;

import com.hansanhha.spring.shop.order.Order;
import com.hansanhha.spring.shop.order.OrderManagement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationIntegrationTests {

    @Autowired
    OrderManagement orders;

    @Test
    void completeOrder() throws Exception {
        orders.request(new Order());

        Thread.sleep(2000);
    }
}
