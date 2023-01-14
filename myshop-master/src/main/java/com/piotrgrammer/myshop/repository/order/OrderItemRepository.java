package com.piotrgrammer.myshop.repository.order;

import com.piotrgrammer.myshop.model.order.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
