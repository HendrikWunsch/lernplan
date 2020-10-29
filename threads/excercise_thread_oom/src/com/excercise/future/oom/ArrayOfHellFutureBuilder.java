package com.excercise.future.oom;


import java.util.concurrent.Future;

public class ArrayOfHellFutureBuilder implements Builder<Future<String>> {


	
	public ArrayOfHellFutureBuilder(){
	}

	public Future<String> build() {
		ArrayOfHellCreator caoh = new ArrayOfHellCreator();
		return caoh;
	}

}