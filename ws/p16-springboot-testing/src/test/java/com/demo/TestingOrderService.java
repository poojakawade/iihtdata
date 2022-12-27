package com.demo;

import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.entities.Order;
import com.demo.exceptions.OrderException;
import com.demo.repositories.OrderRepository;
import com.demo.services.OrderService;

@SpringBootTest
public class TestingOrderService {

    @Autowired
    private OrderService service;

    @MockBean
    private OrderRepository repo;

    @Test
    public void shouldSaveOrder() throws OrderException {
        Order  order = new Order("book", 5);
        Mockito.when(repo.save(order)).thenReturn(new Order(1, "book", 5));

        Order placedOrder = service.placeOrder(order);


        Assertions.assertTrue(placedOrder.getId()>0);
        Assertions.assertEquals(placedOrder.getItem(), "book");
        Assertions.assertEquals(placedOrder.getQuanity(), 5);
    }
    @Test
    public void shouldSaveOrderWithoutUsingRepo() throws OrderException {
        Order order = new Order("Book", 2);

        Mockito.when(repo.save(order)).thenReturn(new Order(3, "MyBook", 10));

        Order placedOrder = service.placeOrder(order);

        Assertions.assertTrue(placedOrder.getId()==3);
        Assertions.assertEquals(placedOrder.getItem(), "MyBook");
    }
    @Test
    public void shouldNotSaveOrder() throws OrderException {

        Order order = null;

        Mockito.when(repo.save(order)).thenThrow(NullPointerException.class);

        Assertions.assertThrows(OrderException.class, ()->{
            service.placeOrder(order);
        });
    }


    
}
