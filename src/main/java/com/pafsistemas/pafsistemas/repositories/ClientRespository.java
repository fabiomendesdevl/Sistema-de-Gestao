package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRespository extends JpaRepository<Client, Long> {
}
