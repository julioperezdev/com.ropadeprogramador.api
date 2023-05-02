package com.ropadeprogramador.api.scraper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class CustomerTransaction {
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
