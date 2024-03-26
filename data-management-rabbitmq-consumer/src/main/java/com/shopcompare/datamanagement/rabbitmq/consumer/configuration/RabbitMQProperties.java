package com.shopcompare.datamanagement.rabbitmq.consumer.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Class representing Rabbit MQ properties.
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties("rabbitmq")
public class RabbitMQProperties {

    private String productsQueueName;

    private String exchangeName;

    private String routingKey;
}
