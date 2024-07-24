package com.devlearn.vlu.server.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;

/**
 * @author tippy091
 * @created 13/07/2024
 * @project Server
 **/


@Data
public class AuthenticationRequest {

    private String username;
    private String password;




}
