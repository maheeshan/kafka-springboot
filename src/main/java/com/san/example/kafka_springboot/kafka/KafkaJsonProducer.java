package com.san.example.kafka_springboot.kafka;

import com.san.example.kafka_springboot.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "json-example")
                .build();
        kafkaTemplate.send(message);

        log.info("Sent user: {} to kafka", user);
    }
}
