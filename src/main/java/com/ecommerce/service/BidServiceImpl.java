package com.ecommerce.service;

import com.ecommerce.model.Bid;
import com.ecommerce.repository.BidRepository;
import com.ecommerce.repository.projection.BidItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BidServiceImpl implements BidService {

    private final BidRepository bidRepository;

    public BidServiceImpl(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public Bid saveBid(Bid bid) {
        bid.setBidTime(LocalDateTime.now());
        return bidRepository.save(bid);
    }

    @Override
    public List<BidItem> findAllBidItemsOfUser(Long userId) {
        return bidRepository.findAllBidsOfUser(userId);
    }


}
