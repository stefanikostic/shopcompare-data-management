package com.shopcompare.datamanagement.business.service;

import com.shopcompare.datamanagement.persistence.domain.Shop;
import com.shopcompare.datamanagement.persistence.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service that provides search operations for shops.
 */
@RequiredArgsConstructor
@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public Shop findById(String shopName) {
        Optional<Shop> shopOptional = shopRepository.findById(shopName);

        return shopOptional.orElse(null);
    }
}
