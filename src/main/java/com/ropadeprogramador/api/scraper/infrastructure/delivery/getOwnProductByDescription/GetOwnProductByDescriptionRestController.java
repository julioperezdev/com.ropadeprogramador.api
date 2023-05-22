package com.ropadeprogramador.api.scraper.infrastructure.delivery.getOwnProductByDescription;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProductByDescription.GetOwnProductByDescriptionGateway;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-own-product-by-description")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class GetOwnProductByDescriptionRestController {

    private final GetOwnProductByDescriptionGateway getOwnProductByDescriptionGateway;

    @GetMapping("/{description}")
    public Object getOwnProductByDescription(@PathVariable String description) throws Exception {
        return getOwnProductByDescriptionGateway.start(description);
    }
}
