package com.devlearn.vlu.server.repository;

import com.devlearn.vlu.server.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tippy091
 * @created 23/07/2024
 * @project Server
 **/

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}