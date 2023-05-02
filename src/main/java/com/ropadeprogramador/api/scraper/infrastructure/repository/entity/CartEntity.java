package com.ropadeprogramador.api.scraper.infrastructure.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
public class CartEntity {

    @Id
    private UUID id;
    private String flashCookieCartId;
    private UUID customerTransactionId;
    private BigDecimal cartTotalPrice;
    private Integer cartTotalQuantity;
    private String productCart;// id-quantity/id-quantity/...
}
