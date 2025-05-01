package com.pafsistemas.pafsistemas.controllers;

import com.pafsistemas.pafsistemas.entities.Stock;
import com.pafsistemas.pafsistemas.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/stocks")
public class StockController {

    @Autowired
    public StockService stockService;

    @PostMapping
    public ResponseEntity<Stock> insertStock(@RequestBody Stock stock){
        stock = stockService.insertStock(stock);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand().toUri();
        return ResponseEntity.created(uri).body(stock);
    }
}
