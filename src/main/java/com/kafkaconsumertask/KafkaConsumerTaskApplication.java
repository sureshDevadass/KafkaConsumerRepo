package com.kafkaconsumertask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaConsumerTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerTaskApplication.class, args);
	}

}
