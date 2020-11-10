package com.excercise.spring;

public class Car {
 
	private Engine engine;
	
	public Car() {
		this.engine = new CombustionEngine();
	}
	
	public void start() {
		engine.turnOn();
	}
}

