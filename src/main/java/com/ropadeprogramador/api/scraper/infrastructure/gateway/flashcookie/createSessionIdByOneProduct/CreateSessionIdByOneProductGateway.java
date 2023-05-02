package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.request.CreateSessionIdByOneProductRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.response.CreateSessionIdByOneProductBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@Slf4j
public class CreateSessionIdByOneProductGateway extends FlashCookieConnection {

    public CreateSessionIdByOneProductBaseResponse start (CreateSessionIdByOneProductRequest request) throws Exception{
        String createSessionIdByOneProductUrl = "https://api.flashcookieapi.com/api/v1/cart";
        HttpEntity<CreateSessionIdByOneProductRequest> requestEntity = buildHttpEntityToCreateSessionIdByProduct(request);
        ResponseEntity<CreateSessionIdByOneProductBaseResponse> response = instanceRestTemplate().exchange(createSessionIdByOneProductUrl, HttpMethod.POST, requestEntity, CreateSessionIdByOneProductBaseResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) System.out.println("mal");
        return response.getBody();
    }

    private HttpEntity<CreateSessionIdByOneProductRequest> buildHttpEntityToCreateSessionIdByProduct(CreateSessionIdByOneProductRequest request){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<CreateSessionIdByOneProductRequest> httpEntity = new HttpEntity<>(request, httpHeaders);
        log.info(httpEntity.getBody().toString());
        return httpEntity;
    }
}
