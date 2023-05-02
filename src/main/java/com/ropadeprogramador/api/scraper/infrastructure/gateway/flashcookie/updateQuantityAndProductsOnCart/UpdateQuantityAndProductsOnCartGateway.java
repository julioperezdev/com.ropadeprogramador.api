package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UpdateQuantityAndProductsOnCartGateway extends FlashCookieConnection {

    public void addProductOneProductOnCart (Object action) throws Exception{
        String addProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                "productId",
                "sessionId",
                "add",
                "cartId");
        ResponseEntity<GetOwnProductsDataResponse> response = instanceRestTemplate().exchange(addProductToCartUrl, HttpMethod.GET, null, GetOwnProductsDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) System.out.println("mal");
    }

    public void lessProductOneProductOnCart (Object action) throws Exception{
        String lessOneProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                "productId",
                "sessionId",
                "less",
                "cartId");
        ResponseEntity<GetOwnProductsDataResponse> response = instanceRestTemplate().exchange(lessOneProductToCartUrl, HttpMethod.GET, null, GetOwnProductsDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) System.out.println("mal");
    }

    public void removeTotalQuantityOfProductsOnCart (Object action) throws Exception{
        String removeProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                "productId",
                "sessionId",
                "remove",
                "cartId");
        ResponseEntity<GetOwnProductsDataResponse> response = instanceRestTemplate().exchange(removeProductToCartUrl, HttpMethod.GET, null, GetOwnProductsDataResponse.class);
        if(!response.getStatusCode().isSameCodeAs(HttpStatus.OK)) System.out.println("mal");
    }
}
