package com.ropadeprogramador.api.scraper.domain.port.getOwnProducts;



import com.ropadeprogramador.api.scraper.domain.model.Product;

import java.util.List;

public interface GetOwnProductsOutputPort {
    List<Product> getOwnProducts();
}
