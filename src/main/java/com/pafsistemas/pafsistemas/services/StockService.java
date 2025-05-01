package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Stock;
import com.pafsistemas.pafsistemas.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    public StockRepository stockRepository;

    public Stock insertStock(Stock stock){
        stock = stockRepository.save(stock);
        return stock;
    }
}
