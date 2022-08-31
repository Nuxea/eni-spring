package com.ecommerce.repository.projection;

import java.time.LocalDateTime;

public interface OrderItem {
    String getName();

    Double getPrice();

    LocalDateTime getOrderTime();
}
