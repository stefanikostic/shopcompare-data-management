package com.shopcompare.datamanagement.persistence.repository;

import com.shopcompare.datamanagement.persistence.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT c FROM Category c WHERE c.name = ?1")
    Optional<Category> findByName(String name);
}
