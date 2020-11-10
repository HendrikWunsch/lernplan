package com.excercise.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombustionEngine implements Engine{
	
	private Camshaft camshaft;
	private Crankshaft crankshaft; 
	
	@Autowired
	public CombustionEngine(Camshaft camshaft, Crankshaft crankshaft) {
		this.camshaft = camshaft;
		this.crankshaft = crankshaft;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Started combustion engine");
	}
}
