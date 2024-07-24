package com.devlearn.vlu.server.services.auth;

import com.devlearn.vlu.server.dto.SignupRequest;
import com.devlearn.vlu.server.dto.UserDto;
import com.devlearn.vlu.server.entity.Order;
import com.devlearn.vlu.server.entity.User;
import com.devlearn.vlu.server.enums.OrderStatus;
import com.devlearn.vlu.server.enums.UserRole;
import com.devlearn.vlu.server.repository.OrderRepository;
import com.devlearn.vlu.server.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author tippy091
 * @created 20/07/2024
 * @project Server
 **/

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private OrderRepository orderRepository;

    public UserDto createUser(SignupRequest signupRequest) {
        User user = new User();
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(encoder.encode(signupRequest.getPassword()));
        user.setRole(UserRole.Customer);
        User createdUser = userRepository.save(user);

        Order order = new Order();
        order.setAmount(0L);
        order.setTotalAmount(0L);
        order.setDiscount(0L);
        order.setUser(createdUser);
        order.setOrderStatus(OrderStatus.Pending);
        orderRepository.save(order);


        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());

        return userDto;

    }

    public Boolean hasUserWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }

    // Create Admin Account
    @PostConstruct
    public void createAdminAccount() {
        User adminAccount = userRepository.findByRole(UserRole.Admin);
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        // Check if there is no Admin Account then create
        if(null == adminAccount) {
            User user = new User();
            user.setEmail("admin@test.com");
            user.setName("admin");
            user.setRole(UserRole.Admin);
            user.setPassword(encoder.encode("123"));
            userRepository.save(user);

        }
    }


}
