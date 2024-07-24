package com.devlearn.vlu.server.services.admin.product;

import com.devlearn.vlu.server.dto.ProductDto;

import java.io.IOException;
import java.util.List;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/
public interface AdminProductService {
    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductByName(String name);
    boolean deleteProduct(Long id);

}
