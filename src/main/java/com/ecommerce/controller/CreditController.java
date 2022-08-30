package com.ecommerce.controller;

import com.ecommerce.model.Credit;
import com.ecommerce.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;

    @PostMapping
    public ResponseEntity<?> saveCredit(@RequestBody Credit credit) {
        return new ResponseEntity<>(creditService.saveCredit(credit), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCredit(@PathVariable Long creditId) {
        creditService.deleteCredit(creditId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCredits() {
        return new ResponseEntity<>(creditService.findAllCredits(), HttpStatus.OK);
    }
}
