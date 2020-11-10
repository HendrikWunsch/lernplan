package com.excercise.spring;

public class ElectricEngine implements Engine{
	private Camshaft camshaft;
	private Crankshaft crankshaft; 
	

	public ElectricEngine(Camshaft camshaft, Crankshaft crankshaft) {
		this.camshaft = camshaft;
		this.crankshaft = crankshaft;
	}
	@Override
	public void turnOn() {
		System.out.println("Started electric engine");
	}
}
