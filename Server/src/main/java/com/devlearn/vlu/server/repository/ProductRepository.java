package com.devlearn.vlu.server.repository;

import com.devlearn.vlu.server.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByNameContaining(String title);
}
