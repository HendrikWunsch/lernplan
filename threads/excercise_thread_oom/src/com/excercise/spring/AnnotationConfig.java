package com.excercise.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
	@Bean									//Wird zwar nicht injected, muss aber Spring genannt werden
	public Car car(Engine engine) {
		return new Car(engine);
	}

	@Bean
	public Engine engine(Camshaft camshaft, Crankshaft crankshaft) {
		return new CombustionEngine(camshaft, crankshaft);
	}

	@Bean
	public Camshaft camshaft() {			//Methodename muss gleich Return Valuetype in lower-camelcase sein!
		return new Camshaft();
	}

	@Bean
	public Crankshaft crankshaft() {
		return new Crankshaft();
	}

}
