package com.devlearn.vlu.server.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author tippy091
 * @created 23/07/2024
 * @project Server
 **/


@Entity
@Table(name="category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Lob
    private String description;

}
