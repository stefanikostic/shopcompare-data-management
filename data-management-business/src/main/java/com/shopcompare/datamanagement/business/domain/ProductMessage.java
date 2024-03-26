package com.shopcompare.datamanagement.business.domain;

import java.io.Serializable;

/**
 * Model representing product message.
 *
 * @param name name of the product.
 * @param shopName name of the shop.
 * @param category name of te category.
 * @param link URL to the product.
 * @param image product image URL.
 * @param isAvailable flag stating whether product is available in stock.
 * @param originalPrice original price of the product.
 * @param promotionalPrice promotional price of the product.
 */
public record ProductMessage(String name,
                             String shopName, String category, String link, String image, boolean isAvailable,
                             Double originalPrice, Double promotionalPrice) implements Serializable {

}
