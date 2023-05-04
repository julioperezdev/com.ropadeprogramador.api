package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetOwnProductsGateway extends FlashCookieConnection {


    public GetOwnProductsDataResponse start () throws Exception{
        String ownProductsUrl = "https://api.flashcookieapi.com/api/v1/store/designs/julioperez";
        ResponseEntity<GetOwnProductsDataResponse> response = instanceRestTemplate().exchange(ownProductsUrl, HttpMethod.GET, null, GetOwnProductsDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) return null;
        return response.getBody();
    }

}
