package com.ropadeprogramador.api.scraper.infrastructure.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class ProductEntity {
    @Id
    private UUID id;
    private Integer flashCookieId;
    private String name;
    private String imageUrl;
    private BigDecimal price;
    private Date createdAt;
    private String productCategoryNames;
    private Integer salesQuantity;
}
