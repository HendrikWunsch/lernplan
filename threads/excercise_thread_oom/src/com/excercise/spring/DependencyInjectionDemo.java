package com.excercise.spring;

public class DependencyInjectionDemo {

	public static void main(String[] args) {
	
		Camshaft combustionCamshaft = new Camshaft();
		Crankshaft combustionCrankshaft = new Crankshaft();
		CombustionEngine combustionEngine = new CombustionEngine(combustionCamshaft, combustionCrankshaft);
		Car combustionCar = new Car(combustionEngine);
		combustionCar.start();
		
		Camshaft electricCamshaft = new Camshaft();
		Crankshaft electricCrankshaft = new Crankshaft();
		ElectricEngine electricEngine = new ElectricEngine(electricCamshaft,electricCrankshaft);
		Car electricCar = new Car(electricEngine);
		electricCar.start();

	}

}
