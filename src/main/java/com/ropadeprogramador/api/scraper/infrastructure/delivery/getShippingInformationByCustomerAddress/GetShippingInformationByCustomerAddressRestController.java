package com.ropadeprogramador.api.scraper.infrastructure.delivery.getShippingInformationByCustomerAddress;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince.GetLocationByProvinceGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getLocationByProvince.response.LocationsByProvinceBaseResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.GetProvincesGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getProvinces.response.AvailableProvincesBaseResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.GetShippingPriceByCustomerAddressGateway;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.request.GetShippingPriceRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getShippingPriceByCustomerAddress.response.GetShippingPriceBaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/shipping-data")
public class GetShippingInformationByCustomerAddressRestController {

    private final GetProvincesGateway getProvincesGateway;
    private final GetLocationByProvinceGateway getLocationByProvinceGateway;
    private final GetShippingPriceByCustomerAddressGateway getShippingPriceByCustomerAddressGateway;

    @GetMapping
    public AvailableProvincesBaseResponse getAvailableProvinces() throws Exception {
        return getProvincesGateway.start();
    }

    @GetMapping("/{provinceId}")
    public LocationsByProvinceBaseResponse getLocationsByProvinceId(@PathVariable String provinceId) throws Exception {
        return getLocationByProvinceGateway.start(provinceId);
    }

    @PostMapping
    public GetShippingPriceBaseResponse getShippingPriceByCustomerAddress(@RequestBody GetShippingPriceRequest request) throws Exception {
        return getShippingPriceByCustomerAddressGateway.start(request);
    }
}
