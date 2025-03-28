package com.kafkaconsumertask;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	List<String> list = new ArrayList<>();

	@KafkaListener(topics="MyKafkaTask",groupId="ConsumerGroup")
	public void getMessage(String msg) {
		addMessage(msg);
	}

	public void addMessage(String msg) {

		list.add(msg);

	}

	public String getAllMessage() {

		return list.toString();
	}

}
