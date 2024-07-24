package com.devlearn.vlu.server.services.admin.category;

import com.devlearn.vlu.server.dto.CategoryDto;
import com.devlearn.vlu.server.entity.Category;
import com.devlearn.vlu.server.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tippy091
 * @created 23/07/2024
 * @project Server
 **/

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();

    }
}
