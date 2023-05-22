package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProductByDescription;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProductByDescription.response.GetOwnProductsByDescriptionDataResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetOwnProductByDescriptionGateway extends FlashCookieConnection {

    public GetOwnProductsByDescriptionDataResponse start (String description) throws Exception{
//https://api.flashcookieapi.com/api/v1/store/product/design?include=&design_slug=dragonball-roshi&product_slug=remera-unisex&shop_slug=videoclub&colors_unactives=1
        String ownProductsByDescriptionUrl = String.format(
                //"https://api.flashcookieapi.com/api/v1/store/designs/julioperez?name=%s",
                "https://api.flashcookieapi.com/api/v1/store/product/design?design_slug=%s&product_slug=remera-unisex&shop_slug=chan-chan",
                description);
        ResponseEntity<GetOwnProductsByDescriptionDataResponse> response = instanceRestTemplate().exchange(ownProductsByDescriptionUrl, HttpMethod.GET, null, GetOwnProductsByDescriptionDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) return null;
        return response.getBody();
    }
}
