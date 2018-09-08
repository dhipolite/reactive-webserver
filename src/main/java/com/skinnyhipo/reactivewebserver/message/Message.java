package com.skinnyhipo.reactivewebserver.message;

public class Message {
	
	String body;

	public Message() {}

	public Message withBody(String body) {
		this.body = body;
		return this;
	}
	
	public String getBody() {
		return this.body;
	}
}
