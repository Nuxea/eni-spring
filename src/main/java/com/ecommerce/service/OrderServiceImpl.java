package com.ecommerce.service;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.repository.projection.OrderItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order saveOrder(Order order) {
        order.setOrderTime(LocalDateTime.now());
        return orderRepository.save(order);
    }

    @Override
    public List<OrderItem> findAllOrderItemsOfUser(Long userId) {
        return orderRepository.findAllOrdersOfUser(userId);
    }


}
