package com.kafka.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.app.service.KafkaConsumerService;

@RestController
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    private final KafkaConsumerService kafkaConsumerService;

    public KafkaController(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @GetMapping("/consume")
    public String consumeMessage() {
        kafkaConsumerService.consume("Sample message from API");
        return "Message consumed successfully!";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Test";
    }

}
