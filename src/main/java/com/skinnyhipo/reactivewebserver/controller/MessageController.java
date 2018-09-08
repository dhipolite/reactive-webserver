package com.skinnyhipo.reactivewebserver.controller;

import com.skinnyhipo.reactivewebserver.message.Message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping
class MessageController {

	public MessageController() {}
	
	@GetMapping
	Flux<Message> allMessages(){
		return Flux.just(
					new Message().withBody("hello Spring 5"),
					new Message().withBody("hello Spring Boot 2")
					);
	}

}
