package com.shopcompare.datamanagement.persistence.repository;

import com.shopcompare.datamanagement.persistence.domain.Product;
import com.shopcompare.datamanagement.persistence.domain.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {

    List<Product> findByShopNameAndCategoryId(String shopName, int categoryId);

    List<Product> findByCategoryIdAndShopNameNot(int categoryId, String shopName);
}
