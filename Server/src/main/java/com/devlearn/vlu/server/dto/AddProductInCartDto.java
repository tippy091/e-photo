package com.devlearn.vlu.server.dto;

import lombok.Data;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/

@Data
public class AddProductInCartDto {

    private Long userId;
    private Long productId;

}
