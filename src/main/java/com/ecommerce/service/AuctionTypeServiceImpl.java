package com.ecommerce.service;

import com.ecommerce.model.AuctionType;
import com.ecommerce.repository.AuctionTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionTypeServiceImpl implements AuctionTypeService {

    private final AuctionTypeRepository auctionTypeRepository;

    public AuctionTypeServiceImpl(AuctionTypeRepository auctionTypeRepository) {
        this.auctionTypeRepository = auctionTypeRepository;
    }

    @Override
    public AuctionType saveAuctionType(AuctionType auctionType) {
        return auctionTypeRepository.save(auctionType);
    }

    @Override
    public void deleteAuctionType(Long id) {
        auctionTypeRepository.deleteById(id);
    }

    @Override
    public List<AuctionType> findAllAuctionTypes() {
        return auctionTypeRepository.findAll();
    }

    @Override
    public AuctionType findAuctionTypeById(Long id){
        return auctionTypeRepository.findAuctionTypeById(id);
    }
}
