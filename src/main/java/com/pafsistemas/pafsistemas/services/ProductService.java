package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.entities.Product;
import com.pafsistemas.pafsistemas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public Product insertProduct(Product product){
        product = productRepository.save(product);
        return product;
    }

    public Product findById(Long id){
        Optional<Product> productList = productRepository.findById(id);
        return productList.get();
    }
}
