package com.excercise.spring;

public class CombustionEngine implements Engine{
	@Override
	public void turnOn() {
		System.out.println("Started combustion engine");
	}
}
