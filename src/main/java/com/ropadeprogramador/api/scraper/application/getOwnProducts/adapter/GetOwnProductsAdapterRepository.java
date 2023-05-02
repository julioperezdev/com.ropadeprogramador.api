package com.ropadeprogramador.api.scraper.application.getOwnProducts.adapter;

import com.ropadeprogramador.api.scraper.domain.model.Product;
import com.ropadeprogramador.api.scraper.domain.port.getOwnProducts.GetOwnProductsOutputPort;

import java.util.List;

public class GetOwnProductsAdapterRepository implements GetOwnProductsOutputPort {
    @Override
    public List<Product> getOwnProducts() {
        return null;
    }
}
