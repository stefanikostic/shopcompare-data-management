package com.shopcompare.service;

import com.shopcompare.domain.Category;
import com.shopcompare.domain.Product;
import com.shopcompare.domain.ProductMessage;
import com.shopcompare.domain.Shop;
import com.shopcompare.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public void insertProduct(ProductMessage productMessage, Category category, Shop shop) {
        Product product = new Product(productMessage.name(), productMessage.link(), productMessage.image(),
                category, shop, productMessage.isAvailable(), productMessage.originalPrice(),
                productMessage.promotionalPrice());
        productRepository.save(product);
    }
}
