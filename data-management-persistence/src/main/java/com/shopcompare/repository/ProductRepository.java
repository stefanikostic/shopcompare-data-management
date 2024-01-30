package com.shopcompare.repository;

import com.shopcompare.domain.Product;
import com.shopcompare.domain.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {
}
