package com.kafka.sample.consumer.kafkasampleconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.sample.consumer.kafkasampleconsumer.model.User;

@Service
public class KafkaConsumer {

	
	@KafkaListener(topics ="vishal_topic", groupId = "group1", containerFactory = "kafkaListenerContainerFactory")
	public void consumeMessage(User user)
	{
		System.out.println(user.getUserName());
	}
}
