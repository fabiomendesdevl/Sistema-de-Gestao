package com.pafsistemas.pafsistemas.controllers;

import com.pafsistemas.pafsistemas.entities.Product;
import com.pafsistemas.pafsistemas.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    public ProductService productService;

    @PostMapping
    public ResponseEntity<Product> insertProduct(@RequestBody Product product){
        product = productService.insertProduct(product);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(product).toUri();
        return ResponseEntity.created(uri).body(product);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByid(@PathVariable Long id){
        Product product = productService.findById(id);
        return ResponseEntity.ok().body(product);
    }
}
