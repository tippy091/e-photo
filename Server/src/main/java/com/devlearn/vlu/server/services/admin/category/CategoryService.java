package com.devlearn.vlu.server.services.admin.category;

import com.devlearn.vlu.server.dto.CategoryDto;
import com.devlearn.vlu.server.entity.Category;

import java.util.List;

/**
 * @author tippy091
 * @created 23/07/2024
 * @project Server
 **/
public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
