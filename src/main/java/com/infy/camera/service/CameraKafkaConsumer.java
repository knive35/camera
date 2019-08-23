package com.infy.camera.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CameraKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(CameraKafkaConsumer.class);
    private static final String TOPIC = "topic_camera";

    @KafkaListener(topics = "topic_camera", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
