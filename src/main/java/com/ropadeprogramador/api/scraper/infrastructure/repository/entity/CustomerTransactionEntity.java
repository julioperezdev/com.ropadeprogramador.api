package com.ropadeprogramador.api.scraper.infrastructure.repository.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class CustomerTransactionEntity {

    @Id
    private UUID id;
    private String sessionId;
    private String cartId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String documentType;
    private String documentNumber;
    private BigDecimal shippingPrice;
    private String addressStreet;
    private String addressNumber;
    private String addressFlat;
    private String addressFloor;
    private String addressReference;
    private String addressPostalCode;
    private String addressProvince;
    private String addressLocality;
}
