package com.shopcompare.datamanagement.business.service;

import com.shopcompare.datamanagement.business.domain.ProductMessage;
import com.shopcompare.datamanagement.persistence.domain.Category;
import com.shopcompare.datamanagement.persistence.domain.Product;
import com.shopcompare.datamanagement.persistence.domain.Shop;
import com.shopcompare.datamanagement.persistence.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service that provides CRUD operations of products.
 */
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public void saveProduct(ProductMessage productMessage, Category category, Shop shop) {
        Product product = new Product(productMessage.name(), productMessage.link(), productMessage.image(),
                category, shop, productMessage.isAvailable(), productMessage.originalPrice(),
                productMessage.promotionalPrice());
        productRepository.save(product);
    }

    public List<Product> getProductsByShopAndCategory(String shopName, int categoryId) {
        return productRepository.findByShopNameAndCategoryId(shopName, categoryId);
    }

    public List<Product> getProductsCategoryAndShopNameNot(String shopName, int categoryId) {
        return productRepository.findByCategoryIdAndShopNameNot(categoryId, shopName);
    }

}
