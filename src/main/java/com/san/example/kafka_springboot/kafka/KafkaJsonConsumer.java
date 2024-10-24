package com.san.example.kafka_springboot.kafka;

import com.san.example.kafka_springboot.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "${spring.kafka.topic.jsonTopic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user) {
        log.info("Json Message Received: {}", user);
    }
}
