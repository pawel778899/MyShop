package com.piotrgrammer.myshop.repository.order;

import com.piotrgrammer.myshop.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
