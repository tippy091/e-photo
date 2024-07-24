package com.devlearn.vlu.server.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/

@Data //@Data is for getter and setters
public class ProductDto {

    private Long id;
    private String name;
    private Long price;
    private String description;
    private byte[] byteImg;
    private Long categoryId;
    private String categoryName;

    private MultipartFile img;
}
