/**
 * 
 */
package com.demo.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.Service.KafkaSenderService;

/**
 * @author FIKRI-PC
 *
 */

@RestController
@RequestMapping("/kafka/")
public class KafkaSenderController {
	
	@Autowired
	KafkaSenderService kafkaSenderService;
	
	@GetMapping(value = "/producer/{message}")
	public String producer(@PathVariable("message") String message) {
		kafkaSenderService.sender(message);

		return "Message sent to the Kafka Topic test1 Successfully";
	}

}
