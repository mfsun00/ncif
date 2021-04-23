package com.example.ncif

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.config.TopicBuilder
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Service

@Service
@Configuration
class DemoService {
    @KafkaListener(id="server", topics = ["kRequests"])
    @SendTo
    fun listen(req:String): String {
        println("Server receive: $req")
        return req.toUpperCase()
    }

    @Bean
    fun kRequests(): NewTopic {
        return TopicBuilder.name("kRequests")
            .partitions(1)
            .replicas(1)
            .build()
    }
}