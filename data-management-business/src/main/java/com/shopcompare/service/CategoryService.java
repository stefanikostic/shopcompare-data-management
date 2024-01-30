package com.shopcompare.service;

import com.shopcompare.domain.Category;
import com.shopcompare.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(int id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }

}
