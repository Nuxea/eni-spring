package com.ecommerce.repository;

import com.ecommerce.model.Bid;
import com.ecommerce.repository.projection.BidItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BidRepository extends JpaRepository<Bid, Long> {

    @Query("select a.name as name, p.price as price, p.bidTime as purchaseTime from Bid p left join Auction a on a.id = p.auctionId where p.userId = :userId")
    List<BidItem> findAllBidsOfUser(@Param("userId") Long userId);
}
