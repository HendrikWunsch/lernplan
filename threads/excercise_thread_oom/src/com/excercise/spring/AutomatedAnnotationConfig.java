package com.excercise.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Car.class)				// Der Packename "com.exercise.spring" würde auch gehen
public class AutomatedAnnotationConfig {					// Mehrfachnennungen sind ebenfalls möglich

}
