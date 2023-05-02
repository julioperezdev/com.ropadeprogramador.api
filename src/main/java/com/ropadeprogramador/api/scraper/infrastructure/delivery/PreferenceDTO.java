package com.ropadeprogramador.api.scraper.infrastructure.delivery;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PreferenceDTO {
    private String message;
    private String idPayment;
    private String urlCheckout;
}
