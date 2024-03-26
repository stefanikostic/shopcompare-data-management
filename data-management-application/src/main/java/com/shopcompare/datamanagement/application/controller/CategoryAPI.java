package com.shopcompare.datamanagement.application.controller;

import com.shopcompare.datamanagement.persistence.domain.Category;
import com.shopcompare.datamanagement.business.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest controller that exposes endpoints for fetching categories.
 */
@RestController
@RequiredArgsConstructor
public class CategoryAPI {

    private final CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> fetchAll() {
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.ok(categories);
    }
}
