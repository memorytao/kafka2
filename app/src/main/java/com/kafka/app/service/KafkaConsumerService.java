package com.kafka.app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.micrometer.common.util.StringUtils;

@Service
public class KafkaConsumerService {

    // @Autowired
    // private KafkaConsumerConfig config;

    @KafkaListener(topics = "third_topic", groupId = "my-second-application")
    public void consume(String message) {

        if(StringUtils.isNotBlank(message))
            System.out.println("Received message: " + message);
            
            
    }
}
