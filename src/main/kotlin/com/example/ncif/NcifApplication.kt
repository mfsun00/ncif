package com.example.ncif

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.config.TopicBuilder
import org.springframework.messaging.handler.annotation.SendTo

@SpringBootApplication
class NcifApplication

fun main(args: Array<String>) {
    runApplication<NcifApplication>(*args)
}


