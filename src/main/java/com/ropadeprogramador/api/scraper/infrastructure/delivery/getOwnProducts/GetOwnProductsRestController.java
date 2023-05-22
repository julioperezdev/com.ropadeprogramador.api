package com.ropadeprogramador.api.scraper.infrastructure.delivery.getOwnProducts;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.GetOwnProductsGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.Instant;

@RestController
@RequestMapping("/api/v1/get-own-products")
@AllArgsConstructor
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
public class GetOwnProductsRestController {

    private final GetOwnProductsGateway getOwnProductsGateway;

    @GetMapping
    public GetOwnProductsDataResponse getOwnProducts() throws Exception {
        log.info("start" + Date.from(Instant.now()));
        GetOwnProductsDataResponse response = getOwnProductsGateway.start();
        log.info("response");
        return response;
    }
}
