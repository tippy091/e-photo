package com.devlearn.vlu.server.services.customer.cart;

import com.devlearn.vlu.server.dto.AddProductInCartDto;
import org.springframework.http.ResponseEntity;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/
public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);
}
