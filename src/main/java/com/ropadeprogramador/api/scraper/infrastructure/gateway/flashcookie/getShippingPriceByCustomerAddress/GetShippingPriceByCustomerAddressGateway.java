package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.request.CreateSessionIdByOneProductRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.response.AvailableProvincesBaseResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.request.GetShippingPriceRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.response.GetShippingPriceBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Objects;

@Service
@Slf4j
public class GetShippingPriceByCustomerAddressGateway extends FlashCookieConnection {

    public GetShippingPriceBaseResponse start (GetShippingPriceRequest request) throws Exception{
        HttpEntity<GetShippingPriceRequest> httpEntity = buildHttpEntityToGetShippingPrice(request);
        String getShippingPriceUrl = "https://api.flashcookieapi.com/api/v1/shipping/get-cotizacion";
        ResponseEntity<GetShippingPriceBaseResponse> response = instanceRestTemplate().exchange(getShippingPriceUrl, HttpMethod.POST, httpEntity, GetShippingPriceBaseResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK) || Objects.isNull(response.getBody()) || !response.getBody().status.equals("success")) log.error("mal");
        return response.getBody();
    }

    private HttpEntity<GetShippingPriceRequest> buildHttpEntityToGetShippingPrice(GetShippingPriceRequest request){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return new HttpEntity<>(request, httpHeaders);
    }
}
