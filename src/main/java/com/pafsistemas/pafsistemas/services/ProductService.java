package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Client;
import com.pafsistemas.pafsistemas.entities.Product;
import com.pafsistemas.pafsistemas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public Product insertProduct(Product product){
        product = productRepository.save(product);
        return product;
    }
}
