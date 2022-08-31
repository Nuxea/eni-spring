package com.ecommerce.controller;

import com.ecommerce.model.Bid;
import com.ecommerce.security.UserPrincipal;
import com.ecommerce.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bid")
public class BidController {

    @Autowired
    private BidService bidService;

    @PostMapping
    public ResponseEntity<?> saveBid(@RequestBody Bid bid) {
        return new ResponseEntity<>(bidService.saveBid(bid), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllBidsOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(bidService.findAllBidItemsOfUser(userPrincipal.getId()));
    }
}
