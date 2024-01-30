package com.shopcompare.service;

import com.shopcompare.domain.Shop;
import com.shopcompare.repository.ShopRepository;
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
