package com.pafsistemas.pafsistemas.controllers;

import com.pafsistemas.pafsistemas.entities.Product;
import com.pafsistemas.pafsistemas.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> obj = productService.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Product> updateProduct(Long id, Product product){
        productService.updateProduto(id, product);
        return ResponseEntity.ok().body(product);
    }
}
