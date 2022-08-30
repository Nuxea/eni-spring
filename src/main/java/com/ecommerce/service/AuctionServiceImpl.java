package com.ecommerce.service;

import com.ecommerce.model.Auction;
import com.ecommerce.repository.AuctionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionServiceImpl(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    @Override
    @Transactional
    public Auction saveAuction(Auction auction) {
//        Auction currentAuction = auctionRepository.getReferenceById(auction.getId());
//        if (currentAuction.getId() == null) {
//            auction.setCreateTime(LocalDateTime.now());
//        }
        if (auction.getId() == null) {
            auction.setCreateTime(LocalDateTime.now());
        }

        return auctionRepository.save(auction);
    }

    @Override
    public void deleteAuction(Long id) {
        auctionRepository.deleteById(id);
    }

    @Override
    public List<Auction> findAllAuctions() {
        return auctionRepository.findAll();
    }

    @Override
    public Auction findAuctionById(Long id) {
        return auctionRepository.findAuctionById(id);
    }
}
