package com.ropadeprogramador.api.scraper.infrastructure.delivery.getShippingPriceByCustomerAddress;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince.GetLocationByProvinceGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince.response.LocationsByProvinceBaseResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.GetProvincesGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.response.AvailableProvincesBaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/shipping-data")
public class GetShippingPriceByCustomerAddressRestController {

    private final GetProvincesGateway getProvincesGateway;
    private final GetLocationByProvinceGateway getLocationByProvinceGateway;

    @GetMapping
    public AvailableProvincesBaseResponse getAvailableProvinces() throws Exception {
        return getProvincesGateway.start();
    }

    @GetMapping("/{provinceId}")
    public LocationsByProvinceBaseResponse getLocationsByProvinceId(@PathVariable String provinceId) throws Exception {
        return getLocationByProvinceGateway.start(provinceId);
    }
}
