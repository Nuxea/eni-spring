package com.ecommerce.controller;

import com.ecommerce.model.Auction;
import com.ecommerce.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auction")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping
    public ResponseEntity<?> saveAuction(@RequestBody Auction auction) {
        return new ResponseEntity<>(auctionService.saveAuction(auction), HttpStatus.CREATED);
    }

    @DeleteMapping("{auctionId}")
    public ResponseEntity<?> deleteAuction(@PathVariable Long auctionId) {
        auctionService.deleteAuction(auctionId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllAuctions() {
        return new ResponseEntity<>(auctionService.findAllAuctions(), HttpStatus.OK);
    }

    @GetMapping("{auctionId}")
    public ResponseEntity<?> getAuctionById(@PathVariable Long auctionId) {
        return new ResponseEntity<>(auctionService.findAuctionById(auctionId), HttpStatus.OK);
    }
}
