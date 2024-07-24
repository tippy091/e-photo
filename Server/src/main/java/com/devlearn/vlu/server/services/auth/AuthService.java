package com.devlearn.vlu.server.services.auth;

import com.devlearn.vlu.server.dto.SignupRequest;
import com.devlearn.vlu.server.dto.UserDto;
import org.springframework.stereotype.Service;

/**
 * @author tippy091
 * @created 20/07/2024
 * @project Server
 **/
public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}
