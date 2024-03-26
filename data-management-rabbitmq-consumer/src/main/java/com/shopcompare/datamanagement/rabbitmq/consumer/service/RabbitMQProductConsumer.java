package com.shopcompare.datamanagement.rabbitmq.consumer.service;

import com.shopcompare.datamanagement.business.domain.ProductMessage;
import com.shopcompare.datamanagement.business.service.CategoryService;
import com.shopcompare.datamanagement.business.service.ProductService;
import com.shopcompare.datamanagement.business.service.ShopService;
import com.shopcompare.datamanagement.persistence.domain.Category;
import com.shopcompare.datamanagement.persistence.domain.Shop;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Service that consumes messages from RabbitMQ product queue.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQProductConsumer {

    private final CategoryService categoryService;
    private final ShopService shopService;
    private final ProductService productService;

    /**
     * Consumes {@link ProductMessage} from queue name defined in property `rabbitmq.products-queue-name`.<br/>
     * It saves the consumed products if extracted category and shop are not null.
     *
     * @param productMessages consumed set of messages.
     */
    @RabbitListener(queues = {"${rabbitmq.products-queue-name}"})
    public void consumeAndPersistProducts(Set<ProductMessage> productMessages) {
        Category category = null;
        Shop shop = null;
        Optional<ProductMessage> firstProductMessageOptional = productMessages.stream().findFirst();
        if (firstProductMessageOptional.isPresent()) {
            ProductMessage productMessage = firstProductMessageOptional.get();
            String categoryName = productMessage.category();
            String shopName = productMessage.shopName();
            category = categoryService.findByName(categoryName);
            shop = shopService.findById(shopName);
        }

        if (category != null && shop != null) {
            for (ProductMessage productMessage : productMessages) {
                productService.saveProduct(productMessage, category, shop);
            }
        }
    }
}
