package com.ropadeprogramador.api.scraper.infrastructure.delivery.createSessionIdByOneProduct;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.CreateSessionIdByOneProductGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.request.CreateSessionIdByOneProductRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.createSessionIdByOneProduct.response.CreateSessionIdByOneProductBaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/create-session-by-one-product")
@AllArgsConstructor
public class CreateSessionIdByOneProductRestController {
    private final CreateSessionIdByOneProductGateway createSessionIdByOneProductGateway;

    @PostMapping()
    public CreateSessionIdByOneProductBaseResponse createSessionIdByOneProduct(@RequestBody CreateSessionIdByOneProductRequest request) throws Exception {
        return createSessionIdByOneProductGateway.start(request);
    }
}
