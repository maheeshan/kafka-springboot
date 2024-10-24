package com.san.example.kafka_springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.strTopic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message) {
        log.info("Message received: {}", message);
    }
}
