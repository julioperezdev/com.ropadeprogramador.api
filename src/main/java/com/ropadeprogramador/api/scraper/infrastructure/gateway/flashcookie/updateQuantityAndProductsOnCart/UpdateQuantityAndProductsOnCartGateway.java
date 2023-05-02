package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart;

import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.FlashCookieConnection;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response.GetOwnProductsDataResponse;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart.request.UpdateQuantityAndProductsOnCartRequest;
import com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.updateQuantityAndProductsOnCart.response.UpdateQuantityAndProductsOnCartBaseResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UpdateQuantityAndProductsOnCartGateway extends FlashCookieConnection {



    public boolean addOneProductOnCart (UpdateQuantityAndProductsOnCartRequest request) throws Exception{
        String addProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                request.productId,//"productId",
                request.sessionId,//"sessionId",
                //"add",
                UpdateQuantityAndProductsOnCartEnum.add,
                request.cartId);//"cartId");
        ResponseEntity<UpdateQuantityAndProductsOnCartBaseResponse> response = instanceRestTemplate().exchange(addProductToCartUrl, HttpMethod.PUT, null, UpdateQuantityAndProductsOnCartBaseResponse.class);
        return validateIfResponseOk(response, request);
    }

    public boolean lessOneProductOnCart (UpdateQuantityAndProductsOnCartRequest request) throws Exception{
        String lessOneProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                request.productId,//"productId",
                request.sessionId,//"sessionId",
                UpdateQuantityAndProductsOnCartEnum.less,//"less",
                request.cartId);//"cartId");

        ResponseEntity<UpdateQuantityAndProductsOnCartBaseResponse> response = instanceRestTemplate().exchange(lessOneProductToCartUrl, HttpMethod.PUT, null, UpdateQuantityAndProductsOnCartBaseResponse.class);
        return validateIfResponseOk(response, request);
    }

    public boolean removeTotalQuantityOfProductsOnCart (UpdateQuantityAndProductsOnCartRequest request) throws Exception{
        String removeProductToCartUrl = String.format(
                "https://api.flashcookieapi.com/api/v1/cart/%s?sesion_id=%s&trigger=%s&cart_id=%s",
                request.productId,//"productId",
                request.sessionId,//"sessionId",
                UpdateQuantityAndProductsOnCartEnum.remove,//"remove",
                request.cartId);//"cartId");
        ResponseEntity<UpdateQuantityAndProductsOnCartBaseResponse> response = instanceRestTemplate().exchange(removeProductToCartUrl, HttpMethod.PUT, null, UpdateQuantityAndProductsOnCartBaseResponse.class);
        return validateIfResponseOk(response, request);
    }

    private boolean validateIfResponseOk(ResponseEntity<UpdateQuantityAndProductsOnCartBaseResponse> response, UpdateQuantityAndProductsOnCartRequest request){
        return response.getStatusCode().isSameCodeAs(HttpStatus.OK)
                && Objects.nonNull(response.getBody())
                && response.getBody().data.sesion_id.equals(request.sessionId);
    }
}
