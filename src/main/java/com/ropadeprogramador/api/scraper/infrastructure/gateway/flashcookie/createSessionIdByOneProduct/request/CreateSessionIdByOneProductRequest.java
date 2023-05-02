package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.request;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateSessionIdByOneProductRequest {
    public int id; //productId
    public String color;
    public String size;
    public String sesion_id; //si es null, lo genera, si no, lo mantiene
}
