package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
