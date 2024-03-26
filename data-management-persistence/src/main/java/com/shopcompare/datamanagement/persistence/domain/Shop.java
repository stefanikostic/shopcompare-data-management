package com.shopcompare.datamanagement.persistence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Persistence model for shop.
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    @Id
    private String name;

}
