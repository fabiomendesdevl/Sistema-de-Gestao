package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.repositories.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    public ClientRespository clientRespository;

    public Client insertClient(Client client){
        return clientRespository.save(client);
    }

    public List<Client> findAll() {
        List<Client> obj = clientRespository.findAll();
        return obj;
    }

    public Client findById(Long id){
        Optional<Client> obj = clientRespository.findById(id);
        return obj.get();
    }

    public void deleteById(Long id){
       clientRespository.deleteById(id);
    }

    public Client updateClient(Long id, Client client){
        Client entity = clientRespository.getReferenceById(id);
        updateData(entity, client);
        return clientRespository.save(entity);
    }

    public void updateData(Client entity, Client client){
        entity.setEmail(client.getEmail());
        entity.setPhone(client.getPhone());
        entity.setNeighborhood(client.getNeighborhood());
    }
}
