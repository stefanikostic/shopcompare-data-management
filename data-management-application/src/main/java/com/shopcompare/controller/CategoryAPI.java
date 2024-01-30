package com.shopcompare.controller;

import com.shopcompare.domain.Category;
import com.shopcompare.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
