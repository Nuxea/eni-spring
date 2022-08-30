package com.ecommerce.controller;

import com.ecommerce.model.AuctionType;
import com.ecommerce.service.AuctionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auction/type")
public class AuctionTypeController {
    @Autowired
    private AuctionTypeService auctionTypeService;

    @PostMapping
    public ResponseEntity<?> saveAuctionType(@RequestBody AuctionType auctionType) {
        return new ResponseEntity<>(auctionTypeService.saveAuctionType(auctionType), HttpStatus.CREATED);
    }

    @DeleteMapping("{auctionTypeId}")
    public ResponseEntity<?> deleteAuctionType(@PathVariable Long auctionTypeId) {
        auctionTypeService.deleteAuctionType(auctionTypeId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllAuctionTypes() {
        return new ResponseEntity<>(auctionTypeService.findAllAuctionTypes(), HttpStatus.OK);
    }

    @GetMapping("{auctionTypeId}")
    public ResponseEntity<?> getAuctionTypeById(@PathVariable Long auctionTypeId) {
        return new ResponseEntity<>(auctionTypeService.findAuctionTypeById(auctionTypeId), HttpStatus.OK);
    }
}
