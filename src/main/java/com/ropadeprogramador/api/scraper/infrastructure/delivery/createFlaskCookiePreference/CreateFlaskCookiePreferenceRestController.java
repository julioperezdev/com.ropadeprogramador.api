package com.ropadeprogramador.api.scraper.infrastructure.delivery.createFlaskCookiePreference;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createFlaskCookiePreference.CreateFlashCookiePreferenceGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createFlaskCookiePreference.request.FlaskCookiePreferenceRequestBase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkout")
@AllArgsConstructor
public class CreateFlaskCookiePreferenceRestController {

    private final CreateFlashCookiePreferenceGateway createFlashCookiePreferenceGateway;

    @PostMapping
    public Object createFlaskCookiePreference(@RequestBody FlaskCookiePreferenceRequestBase request) throws Exception {
        return createFlashCookiePreferenceGateway.start(request);
    }
}
