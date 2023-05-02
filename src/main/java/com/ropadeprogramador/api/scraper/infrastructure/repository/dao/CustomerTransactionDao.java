package com.ropadeprogramador.api.scraper.infrastructure.repository.dao;

import com.ropadeprogramador.api.scraper.infrastructure.repository.entity.CustomerTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerTransactionDao extends JpaRepository<CustomerTransactionEntity, UUID> {
}
