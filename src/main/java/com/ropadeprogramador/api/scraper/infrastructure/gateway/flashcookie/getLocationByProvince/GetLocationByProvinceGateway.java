package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince.response.LocationsByProvinceBaseResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.response.AvailableProvincesBaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetLocationByProvinceGateway extends FlashCookieConnection {

    public LocationsByProvinceBaseResponse start (String id) throws Exception{
        String locationsByProvincesUrl = String.format("https://api.flashcookieapi.com/api/v1/shipping/get-localidades/%s", id);
        ResponseEntity<LocationsByProvinceBaseResponse> response = instanceRestTemplate().exchange(locationsByProvincesUrl, HttpMethod.GET, null, LocationsByProvinceBaseResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) log.error("mal");
        return response.getBody();
    }
}
