package com.shopcompare.datamanagement.business.domain;

import java.io.Serializable;

public record ProductMessage(String name,
                             String shopName, String category, String link, String image, boolean isAvailable,
                             Double originalPrice, Double promotionalPrice) implements Serializable {

}
