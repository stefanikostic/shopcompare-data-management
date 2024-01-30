package com.shopcompare.service;

import com.shopcompare.domain.Category;
import com.shopcompare.domain.ProductMessage;
import com.shopcompare.domain.Shop;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQProductConsumer {

    private final CategoryService categoryService;
    private final ShopService shopService;
    private final ProductService productService;

    @RabbitListener(queues = {"${rabbitmq.queue-name}"})
    public void consume(Set<ProductMessage> productMessages) {
        Optional<ProductMessage> productMessageOptional = productMessages.stream().findFirst();

        Category category = null;
        Shop shop = null;
        if (productMessageOptional.isPresent()) {
            ProductMessage productMessage = productMessageOptional.get();
            int categoryId = productMessage.categoryId();
            String shopName = productMessage.shopName();
            category = categoryService.findById(categoryId);
            shop = shopService.findById(shopName);
        }

        if (category != null && shop != null) {
            for (ProductMessage productMessage : productMessages) {
                productService.insertProduct(productMessage, category, shop);
            }
        }
    }
}
