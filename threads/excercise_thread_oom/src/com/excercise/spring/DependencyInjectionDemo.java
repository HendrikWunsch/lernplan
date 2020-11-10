package com.excercise.spring;

public class DependencyInjectionDemo {

	public static void main(String[] args) {
	
		CombustionEngine combustionEngine = new CombustionEngine();
		Car combustionCar = new Car(combustionEngine);
		combustionCar.start();
		
		
		ElectricEngine electricEngine = new ElectricEngine();
		Car electricCar = new Car(electricEngine);
		electricCar.start();

	}

}
