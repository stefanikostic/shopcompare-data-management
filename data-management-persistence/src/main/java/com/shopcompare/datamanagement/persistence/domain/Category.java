package com.shopcompare.datamanagement.persistence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Persistence model for category.
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    private int id;

    private String name;

    private Integer superCategoryId;
}
