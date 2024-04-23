package com.example.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic testTopic(){
        return TopicBuilder.name("topic1")
                .build();
    }

    @Bean
    public NewTopic testJsonTopic(){
        return TopicBuilder.name("topicJson")
                .build();
    }

}
