package com.excercise.spring;

public class CombustionCar extends Car {
	
	public CombustionCar(Camshaft camshaft, Crankshaft crankshaft) {
		super(new CombustionEngine(camshaft,crankshaft));
	}
	
}

