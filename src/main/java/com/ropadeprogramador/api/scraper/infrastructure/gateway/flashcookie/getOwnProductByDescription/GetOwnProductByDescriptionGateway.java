package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProductByDescription;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GetOwnProductByDescriptionGateway extends FlashCookieConnection {

    public GetOwnProductsDataResponse start (String description) throws Exception{

        String ownProductsByDescriptionUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/store/designs/julioperez?name=%s",
                description);
        ResponseEntity<GetOwnProductsDataResponse> response = instanceRestTemplate().exchange(ownProductsByDescriptionUrl, HttpMethod.GET, null, GetOwnProductsDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) return null;
        return response.getBody();
    }
}
