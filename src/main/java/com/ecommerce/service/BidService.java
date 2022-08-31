package com.ecommerce.service;

import com.ecommerce.model.Bid;
import com.ecommerce.repository.projection.BidItem;

import java.util.List;

public interface BidService {
    Bid saveBid(Bid bid);

    List<BidItem> findAllBidItemsOfUser(Long userId);
}
