package com.pafsistemas.pafsistemas.controllers;


import com.pafsistemas.pafsistemas.controllers.Exceptions.ClientException;
import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    public ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> insertClient(@RequestBody Client client) {
        client = clientService.insertClient(client);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(client.getId()).toUri();
        return ResponseEntity.created(uri).body(client);
    }

    @GetMapping()
    public ResponseEntity<List<Client>> findAll() {
        List<Client> obj = clientService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        try {
            Client obj = clientService.findById(id);
            return ResponseEntity.ok().body(obj);
        }catch (RuntimeException e){
            throw new ClientException("Cliente não encontrado na base de dados...");
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        clientService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client client){
        client = clientService.updateClient(id, client);
        return ResponseEntity.ok().body(client);
    }
}

