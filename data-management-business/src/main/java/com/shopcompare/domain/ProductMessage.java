package com.shopcompare.domain;

import java.io.Serializable;

public record ProductMessage(String name,
                             String shopName, int categoryId, String link, String image, boolean isAvailable,
                             Double originalPrice, Double promotionalPrice) implements Serializable {

}
