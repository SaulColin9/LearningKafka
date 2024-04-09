package com.example.demo.consumer;

import com.example.demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
//    @KafkaListener(topics = {"saulTopic"}, groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(String.format("Consuming the message from saulTopic:: %s", msg));
    }

    @KafkaListener(topics = {"saulTopic"}, groupId = "myGroup")
    public void consumeMsg(Student student) {
        log.info(String.format("Consuming the message from saulTopic:: %s", student));
    }
}
