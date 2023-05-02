package com.ropadeprogramador.api.scraper.infrastructure.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class ProductCategoryEntity {

    @Id
    private UUID id;
    private String name;
}
