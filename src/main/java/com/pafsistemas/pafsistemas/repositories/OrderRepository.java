package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
