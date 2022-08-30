package com.ecommerce.service;

import com.ecommerce.model.Auction;

import java.util.List;

public interface AuctionService {

    Auction saveAuction(Auction auction);

    void deleteAuction(Long id);

    List<Auction> findAllAuctions();

    Auction findAuctionById(Long id);
}
