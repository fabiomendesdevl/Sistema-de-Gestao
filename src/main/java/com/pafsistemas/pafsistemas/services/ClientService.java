package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.repositories.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    public ClientRespository clientRespository;

    public Client insertClient(Client client){
        return clientRespository.save(client);
    }
}
