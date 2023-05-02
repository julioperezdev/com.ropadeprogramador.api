package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getBuyDetailsBySessionId;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getBuyDetailsBySessionId.request.SessionIdToGetDetailsRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getBuyDetailsBySessionId.response.GetBuyDetailsBySessionIdResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
public class GetBuyDetailsBySessionIdGateway extends FlashCookieConnection {
//JhBoiHa6PxyIVdgQ9QSu62o52PtKj2Yh2pTtXo5T
    public GetBuyDetailsBySessionIdResponse start (SessionIdToGetDetailsRequest request) throws Exception{
        String getBuyDetailsBySessionIdUrl = String.format("https://api.flashcookieapi.com/api/v1/cart?sesion_id=%s", request.session_id);
        ResponseEntity<GetBuyDetailsBySessionIdResponse> response = instanceRestTemplate().exchange(getBuyDetailsBySessionIdUrl, HttpMethod.GET, null, GetBuyDetailsBySessionIdResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) System.out.println("mal");
        return response.getBody();
    }
}
