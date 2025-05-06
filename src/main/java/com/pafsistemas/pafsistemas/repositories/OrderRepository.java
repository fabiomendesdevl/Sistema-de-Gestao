package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

