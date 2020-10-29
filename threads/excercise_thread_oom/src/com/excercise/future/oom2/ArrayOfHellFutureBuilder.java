package com.excercise.future.oom2;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.commons.lang3.builder.Builder;

public class ArrayOfHellFutureBuilder implements Builder<Future<String>> {
	
	private static final int MIN = 200_000_000;
	private static int count = 0; // FixMe
	private ExecutorService executor = null;

	public ArrayOfHellFutureBuilder(ExecutorService executor) {
		this.executor = executor;
	}

	public Future<String> build() {
		final int counter;
		synchronized(this) {
			 counter = count++;			
		}
		
		return executor.submit(() -> {
			long start = System.currentTimeMillis();
			Random r = new Random();
			int[] intA = new int[r.nextInt(MIN)];
			intA[0] = r.nextInt(MIN) + MIN;
			Thread.sleep((long) (Math.random() * 5000 ) + 5000);
			long duration = System.currentTimeMillis() - start;
			String s = ("Count: " + counter + " Das Array enthält: " + intA[0] + " Duration: " + duration);
			return s;
		});
	}

}