package com.excercise.future.oom;



import java.util.concurrent.Future;

public class ArrayOfHellFutureBuilderFluent implements Builder<Future<String>> {

	
	private int min = 1_000_000_000;
	private int count = 0;
	private long time = 0;
	
	public ArrayOfHellFutureBuilderFluent(){
	}

	public Future<String> build() {
		ArrayOfHellCreator caoh = new ArrayOfHellCreator();
		caoh.count = this.count;
		return caoh;
	}
	
	public ArrayOfHellFutureBuilderFluent withMinRandom(int min) {
		this.min = min;
		return this;
	}

}