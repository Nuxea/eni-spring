package com.ecommerce.service;

import com.ecommerce.model.Credit;
import com.ecommerce.repository.CreditRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl implements CreditService{

    private final CreditRepository creditRepository;

    public CreditServiceImpl(CreditRepository creditRepository){
        this.creditRepository = creditRepository;
    }

    @Override
    public Credit saveCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public void deleteCredit(Long id) {
        creditRepository.deleteById(id);
    }

    @Override
    public List<Credit> findAllCredits() {
        return creditRepository.findAll();
    }

}
