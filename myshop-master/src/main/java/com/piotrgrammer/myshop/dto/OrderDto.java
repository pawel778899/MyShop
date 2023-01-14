package com.piotrgrammer.myshop.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OrderDto {
    private String firstName;
    private String lastName;
    private String address;
    private String postCode;
    private String city;
}
