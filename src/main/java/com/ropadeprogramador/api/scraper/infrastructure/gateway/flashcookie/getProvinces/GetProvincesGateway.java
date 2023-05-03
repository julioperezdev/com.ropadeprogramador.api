package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.response.AvailableProvincesBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetProvincesGateway extends FlashCookieConnection {

    public AvailableProvincesBaseResponse start () throws Exception{
        String availableProvincesUrl = "https://api.flashcookieapi.com/api/v1/shipping/get-provincias";
        ResponseEntity<AvailableProvincesBaseResponse> response = instanceRestTemplate().exchange(availableProvincesUrl, HttpMethod.GET, null, AvailableProvincesBaseResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) log.error("mal");
        return response.getBody();
    }
}
