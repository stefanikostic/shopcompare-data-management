package com.shopcompare.datamanagement.application.controller;


import com.shopcompare.datamanagement.business.service.ProductService;
import com.shopcompare.datamanagement.persistence.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest endpoint that exposes endpoints for fetching products.
 */
@RestController
@RequiredArgsConstructor
public class ProductsAPI {

    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProductsByCategoryAndShopName(@RequestParam("shopName") String shopName,
                                                                          @RequestParam("categoryId") int categoryId) {
        return ResponseEntity.ok(productService.getProductsByShopAndCategory(shopName, categoryId));
    }

    @GetMapping("/products/not-in-shop")
    public ResponseEntity<List<Product>> getProductsByCategoryAndShopNameNot(@RequestParam("shopName") String shopName,
                                                                          @RequestParam("categoryId") int categoryId) {
        return ResponseEntity.ok(productService.getProductsCategoryAndShopNameNot(shopName, categoryId));
    }

}
