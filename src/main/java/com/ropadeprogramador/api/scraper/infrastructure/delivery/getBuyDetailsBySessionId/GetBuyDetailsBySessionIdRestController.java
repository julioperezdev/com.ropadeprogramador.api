package com.ropadeprogramador.api.scraper.infrastructure.delivery.getBuyDetailsBySessionId;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getBuyDetailsBySessionId.GetBuyDetailsBySessionIdGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getBuyDetailsBySessionId.request.SessionIdToGetDetailsRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-buy-details-by-session-id")
@AllArgsConstructor
public class GetBuyDetailsBySessionIdRestController {

    private final GetBuyDetailsBySessionIdGateway getBuyDetailsBySessionIdGateway;

    @GetMapping("{sessionId}")
    public Object getBuyDetailsBySessionId(@PathVariable String sessionId) throws Exception {
        return getBuyDetailsBySessionIdGateway.start(new SessionIdToGetDetailsRequest(sessionId));
    }
}
