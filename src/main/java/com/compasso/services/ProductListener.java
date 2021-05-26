package com.compasso.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.compasso.configs.MQConfig;
import com.compasso.models.Product;

@Component
public class ProductListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(Product prod) {
		System.out.println("Product Received: " + prod);
	}
}