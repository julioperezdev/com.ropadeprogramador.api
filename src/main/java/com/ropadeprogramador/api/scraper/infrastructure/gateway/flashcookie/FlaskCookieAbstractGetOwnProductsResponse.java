package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.ParticularOwnProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlaskCookieAbstractGetOwnProductsResponse{
    //public LinkedHashMap<String, List<Object>> body;
    public List<ParticularOwnProduct> data;
    //public Object meta;
}
