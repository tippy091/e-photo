package com.devlearn.vlu.server.dto;

import com.devlearn.vlu.server.enums.UserRole;
import lombok.Data;

/**
 * @author tippy091
 * @created 20/07/2024
 * @project Server
 **/


@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
    private UserRole userRole;

}
