package com.ropadeprogramador.api.scraper.infrastructure.delivery.getOwnProducts;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlaskCookieAbstractGetOwnProductsResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.GetOwnProductsGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-own-products")
@AllArgsConstructor
@Slf4j
public class GetOwnProductsRestController {

    private final GetOwnProductsGateway getOwnProductsGateway;

    @GetMapping
    public GetOwnProductsDataResponse getOwnProducts() throws Exception {
        return getOwnProductsGateway.start();
    }
}
