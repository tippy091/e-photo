package com.devlearn.vlu.server.entity;

import com.devlearn.vlu.server.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;


/**
 * @author tippy091
 * @created 12/07/2024
 * @project Server
 * Sử dụng thư viện Lombok và JPA để khởi tạo Table User trong CSDL.
 **/

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private UserRole role;


    @Lob
    @Column(columnDefinition = "longblob")
    private byte[] img;


}
