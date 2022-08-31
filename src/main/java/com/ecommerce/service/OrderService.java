package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.repository.projection.OrderItem;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);

    List<OrderItem> findAllOrderItemsOfUser(Long userId);
}
