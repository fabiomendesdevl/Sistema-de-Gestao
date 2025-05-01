package com.pafsistemas.pafsistemas.controllers;

import com.pafsistemas.pafsistemas.entities.Financial;
import com.pafsistemas.pafsistemas.services.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/financials")
public class FinancialController {

    @Autowired
    public FinancialService financialService;

    @PostMapping
    public ResponseEntity<Financial> insertFinancial(@RequestBody Financial financial){
        financial = financialService.insertFinancial(financial);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand().toUri();
        return ResponseEntity.created(uri).build();
    }
}
