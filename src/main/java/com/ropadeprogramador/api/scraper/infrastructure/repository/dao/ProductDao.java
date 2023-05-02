package com.ropadeprogramador.api.scraper.infrastructure.repository.dao;

import com.ropadeprogramador.api.scraper.infrastructure.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductDao extends JpaRepository<ProductEntity, UUID> {
}
