package com.shopcompare.datamanagement.business.service;

import com.shopcompare.datamanagement.persistence.domain.Shop;
import com.shopcompare.datamanagement.persistence.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public List<Shop> findAll() {
        return shopRepository.findAll();
    }

    public Shop findById(String shopName) {
        Optional<Shop> shop = shopRepository.findById(shopName);

        return shop.get();
    }
}
