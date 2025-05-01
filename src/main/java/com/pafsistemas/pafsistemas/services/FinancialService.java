package com.pafsistemas.pafsistemas.services;

import com.pafsistemas.pafsistemas.entities.Financial;
import com.pafsistemas.pafsistemas.repositories.FinancialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialService {

    @Autowired
    public FinancialRepository financialRepository;

    public Financial insertFinancial(Financial financial){
        return financialRepository.save(financial);
    }
}
