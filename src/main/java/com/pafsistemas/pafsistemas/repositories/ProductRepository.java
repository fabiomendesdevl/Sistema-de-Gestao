package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
