package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Order;
import com.demo.exceptions.OrderException;
import com.demo.services.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping()
    public List<Order> getOrders() throws OrderException{
        return service.findAllOrders();// -> List--
    }
	
	@PostMapping("")
	public Order placeOrder(@RequestBody Order order) throws OrderException{
		return service.placeOrder(order);
	}
	
}
