package com.ecommerce.repository;

import com.ecommerce.model.Order;
import com.ecommerce.repository.projection.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select c.name as name, o.price as price, o.orderTime as orderTime from Order o left join Credit c on c.id = o.creditId where o.userId = :userId")
    List<OrderItem> findAllOrdersOfUser(@Param("userId") Long userId);
}
