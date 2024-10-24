package com.san.example.kafka_springboot.controller;

import com.san.example.kafka_springboot.kafka.KafkaJsonProducer;
import com.san.example.kafka_springboot.kafka.KafkaProducer;
import com.san.example.kafka_springboot.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent");
    }

    @PostMapping("/publish")
    public ResponseEntity<User> publishMessage(@RequestBody User user) {
        kafkaJsonProducer.sendMessage(user);
        return ResponseEntity.ok(user);
    }
}
