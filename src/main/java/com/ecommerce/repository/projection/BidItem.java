package com.ecommerce.repository.projection;

import java.time.LocalDateTime;

public interface BidItem {
    String getName();

    Integer getPrice();

    LocalDateTime getBidTime();
}
