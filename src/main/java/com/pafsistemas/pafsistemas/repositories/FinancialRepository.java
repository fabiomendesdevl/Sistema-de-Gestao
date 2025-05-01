package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Financial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRepository extends JpaRepository<Financial, Long> {
}
