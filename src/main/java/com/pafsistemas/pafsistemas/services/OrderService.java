package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Order;
import com.pafsistemas.pafsistemas.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;

    public Order insertOrder(Order order){
        order = orderRepository.save(order);
        return order;
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }
}
