package com.ecommerce.service;

import com.ecommerce.model.Credit;

import java.util.List;

public interface CreditService {

    Credit saveCredit(Credit credit);

    void deleteCredit(Long id);

    List<Credit> findAllCredits();

}
