package com.ropadeprogramador.api.scraper.application.getOwnProducts.service;

import com.ropadeprogramador.api.scraper.domain.model.Product;
import com.ropadeprogramador.api.scraper.domain.port.getOwnProducts.GetOwnProducts;
import com.ropadeprogramador.api.scraper.domain.port.getOwnProducts.GetOwnProductsOutputPort;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class GetOwnProductsService implements GetOwnProducts {
    private final GetOwnProductsOutputPort getOwnProductsOutputPort;

    public GetOwnProductsService(GetOwnProductsOutputPort getOwnProductsOutputPort) {
        this.getOwnProductsOutputPort = getOwnProductsOutputPort;
    }

    @Override
    public List<Product> getOwnProducts() {
        System.out.println("mensaje");
        log.info("message");
        getOwnProductsOutputPort.getOwnProducts();
        return null;
    }

    @Override
    public Product getOwnProductByName(String name) {
        return null;
    }
}
