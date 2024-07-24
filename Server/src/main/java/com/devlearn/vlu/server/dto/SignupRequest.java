package com.devlearn.vlu.server.dto;

import lombok.Data;

/**
 * @author tippy091
 * @created 20/07/2024
 * @project Server
 **/


@Data
public class SignupRequest {

    private String email;
    private String password;
    private String name;

}
