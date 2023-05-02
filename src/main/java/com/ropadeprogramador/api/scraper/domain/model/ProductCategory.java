package com.ropadeprogramador.api.scraper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ProductCategory {
    private UUID id;
    private String name;
}
