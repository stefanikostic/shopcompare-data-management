package com.shopcompare.datamanagement.persistence.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Persistence model for Product.
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ProductId.class)
public class Product {

    @Id
    private String name;

    @Id
    private String link;

    private String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "shop_name")
    private Shop shop;

    private boolean isAvailable;

    private Double originalPrice;

    private Double promotionalPrice;

}
