package com.ropadeprogramador.api.scraper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Product {
    private UUID id;
    private Integer flashCookieId;
    private String name;
    private String imageUrl;
    private BigDecimal price;
    private Date createdAt;
    private String productCategoryNames;
    private Integer salesQuantity;
}
