package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class FlashCookieConnection {

    private final String INITIALIZE_URL_PARAMETER = "?";
    private final String NEXT_URL_PARAMETER_SYMBOL = "&";

    public RestTemplate instanceRestTemplate(){
        return new RestTemplate();
    }

    public HttpEntity<HttpHeaders> getHeadersWithCredentials() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        //httpHeaders.set("Bearer ","");
        return new HttpEntity<>(httpHeaders);
    }


}
