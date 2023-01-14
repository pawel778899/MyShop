package com.piotrgrammer.myshop.model.order;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long orderId;
    private String firstName;
    private String lastName;
    private String address;
    private String postCode;
    private String city;
    private LocalDateTime created;

    @OneToMany
    @JoinColumn(name = "orderId")
    private List<OrderItem> orderItems;
}
