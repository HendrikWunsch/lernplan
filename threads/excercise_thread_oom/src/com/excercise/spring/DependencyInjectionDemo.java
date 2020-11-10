package com.excercise.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Car car = context.getBean(Car.class);
		car.start();
		
	}

}
