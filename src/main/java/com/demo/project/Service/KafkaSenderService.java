/**
 * 
 */
package com.demo.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author FIKRI-PC
 *
 */
@Service
public class KafkaSenderService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "test1";
	
	public void sender(String message) {
		kafkaTemplate.send(kafkaTopic, message);
	}

}
