package com.piotrgrammer.myshop.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class OrderItem {

    @Id
    @GeneratedValue
    private Long orderItemId;
    private Long orderId;
    private Long itemId;
    private int amount;

    public OrderItem(Long orderId, Long itemId, int amount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.amount = amount;
    }
}
