package com.kafkaconsumertask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaConsumerController {

	@Autowired
	public KafkaConsumer kc;

	@GetMapping("getAllMsg")
	public String getAllMsg() {

		return kc.getAllMessage();
	}

}
