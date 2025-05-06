package com.pafsistemas.pafsistemas.repositories;

import com.pafsistemas.pafsistemas.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRespository extends JpaRepository<Client, Long> {
}
