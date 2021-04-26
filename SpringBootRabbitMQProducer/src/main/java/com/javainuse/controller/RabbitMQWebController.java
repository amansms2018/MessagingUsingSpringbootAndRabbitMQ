package com.javainuse.controller;

import com.javainuse.service.RabbitMQSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.javainuse.model.Employee;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq")
public class RabbitMQWebController {

	@Autowired
	RabbitMQSenderService rabbitMQSender;
	@PostMapping(value = "/producer")
	public String producer(@RequestBody Employee employee) {
		rabbitMQSender.send(employee);
		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}

}

