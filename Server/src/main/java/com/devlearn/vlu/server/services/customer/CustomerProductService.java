package com.devlearn.vlu.server.services.customer;

import com.devlearn.vlu.server.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/
public interface CustomerProductService
{

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();
}
