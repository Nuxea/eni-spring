package com.ecommerce.repository;

import com.ecommerce.model.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, Long> {

    Auction findAuctionById(long id);
}
