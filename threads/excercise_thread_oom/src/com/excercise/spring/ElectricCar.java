package com.excercise.spring;

public class ElectricCar extends Car{
 
	public ElectricCar(Camshaft camshaft, Crankshaft crankshaft) {
		super(new ElectricEngine(camshaft,crankshaft));
	}
}

