package com.ropadeprogramador.api.scraper.infrastructure.delivery.updateQuantityAndProductsOnCart;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart.UpdateQuantityAndProductsOnCartGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart.request.UpdateQuantityAndProductsOnCartRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/update-quantity-and-products-on-cart")
@Slf4j
@AllArgsConstructor
public class UpdateQuantityAndProductsOnCartRestController {

    private final UpdateQuantityAndProductsOnCartGateway updateQuantityAndProductsOnCartGateway;

    @PutMapping("/add")
    public boolean addOneProductOnCart(@RequestBody UpdateQuantityAndProductsOnCartRequest request) throws Exception {
        log.info("add");
        return updateQuantityAndProductsOnCartGateway.addOneProductOnCart(request);
    }

    @PutMapping("/less")
    public boolean lessOneProductOnCart(@RequestBody UpdateQuantityAndProductsOnCartRequest request) throws Exception {
        log.info("less");
        return updateQuantityAndProductsOnCartGateway.lessOneProductOnCart(request);

    }

    @PutMapping("/remove")
    public boolean removeTotalQuantityOfProductsOnCart(@RequestBody UpdateQuantityAndProductsOnCartRequest request) throws Exception {
        log.info("remove");
        return updateQuantityAndProductsOnCartGateway.removeTotalQuantityOfProductsOnCart(request);
    }
}
