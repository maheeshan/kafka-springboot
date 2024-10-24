package com.san.example.kafka_springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.strTopic}")
    private String stringTopicName;

    @Value("${spring.kafka.topic.jsonTopic}")
    private String jsonTopicName;

    @Bean
    public NewTopic exampleTopic() {
        return TopicBuilder
                .name(stringTopicName)
                .build();
    }

    @Bean
    public NewTopic exampleJsonTopic() {
        return TopicBuilder
                .name(jsonTopicName)
                .build();
    }
}
