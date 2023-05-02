package com.ropadeprogramador.api.scraper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Cart {
    private UUID id;
    private String flashCookieCartId;
    private UUID customerTransactionId;
    private BigDecimal cartTotalPrice;
    private Integer cartTotalQuantity;
    private String productCart;
}
