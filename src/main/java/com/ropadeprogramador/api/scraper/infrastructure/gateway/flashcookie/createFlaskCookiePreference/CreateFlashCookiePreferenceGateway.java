package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createFlaskCookiePreference;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createFlaskCookiePreference.request.FlaskCookiePreferenceRequestBase;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.request.GetShippingPriceRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.response.GetShippingPriceBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Objects;

@Service
@Slf4j
public class CreateFlashCookiePreferenceGateway extends FlashCookieConnection {

    public Object start (FlaskCookiePreferenceRequestBase request) throws Exception{
        HttpEntity<FlaskCookiePreferenceRequestBase> httpEntity = buildHttpEntityToCreatePreference(request);
        String preferenceGeneratorUrl = "https://api.flashcookieapi.com/api/v1/checkout";
        ResponseEntity<Object> response = instanceRestTemplate().exchange(preferenceGeneratorUrl, HttpMethod.POST, httpEntity, Object.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK) || Objects.isNull(response.getBody())) log.error("mal");
        return response.getBody();
    }

    private HttpEntity<FlaskCookiePreferenceRequestBase> buildHttpEntityToCreatePreference(FlaskCookiePreferenceRequestBase request){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return new HttpEntity<>(request, httpHeaders);
    }
}
