package com.ecommerce.repository;

import com.ecommerce.model.AuctionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionTypeRepository extends JpaRepository<AuctionType, Long> {

    AuctionType findAuctionTypeById(Long id);

}
