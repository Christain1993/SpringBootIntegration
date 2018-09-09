package com.bus365.root.model.listenrs;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class Listener {

    @KafkaListener(topics = {"test"})
    public void listen(ConsumerRecord<?, ?> record) {
    	System.out.println("kafka的key: " + record.key());
    	System.out.println("kafka的value: " + record.value().toString());
    }
}