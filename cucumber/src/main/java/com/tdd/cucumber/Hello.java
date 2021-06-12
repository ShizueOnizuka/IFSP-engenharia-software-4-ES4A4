package com.tdd.cucumber;

/**
 * Hello world!
 *
 */
public class Hello {
	private final String greeting;
	
	public Hello (String greeting) {
		this.greeting = greeting;
	}

	public String sayHi () {
		return "Hello Bilbobao" + greeting;
	}
}