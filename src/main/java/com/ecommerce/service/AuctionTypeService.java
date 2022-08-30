package com.ecommerce.service;

import com.ecommerce.model.AuctionType;

import java.util.List;

public interface AuctionTypeService {
    AuctionType saveAuctionType(AuctionType auctionType);

    void deleteAuctionType(Long id);

    List<AuctionType> findAllAuctionTypes();

    AuctionType findAuctionTypeById(Long id);
}
