package com.tdd.cucumber;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloSteps {
	private Hello hello
		private String hi;

	@Given("^que eu tenho uma app que recebe \"Hi")
	public void I_have_a_hello_app_with(String greeting) {
		hello = new Hello(greetin);
		}
	
	@When("^eu pedir que ela diga \"Hi")
	public void I_ask_it_to_say_hi() {
		hi = hello.sayHi();
		}
	
	@Then("^ela deveria responde \"Hello World")
	public void it_should_answer_with(String expectedHi) {
		assertEquals(expectedHi, hi);
		}
}
