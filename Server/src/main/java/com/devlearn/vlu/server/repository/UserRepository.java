package com.devlearn.vlu.server.repository;

import com.devlearn.vlu.server.entity.User;
import com.devlearn.vlu.server.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author tippy091
 * @created 13/07/2024
 * @project Server
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    User findByRole(UserRole userRole);
}
