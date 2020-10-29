package com.excercise.thread.oom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadOom {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newWorkStealingPool();

		List<CreateArrayOfHell> list = new ArrayList<CreateArrayOfHell>();
		for (int i = 0; i < 100; i++) {
			list.add(new CreateArrayOfHell());
		}

		long start = System.currentTimeMillis();

		list.forEach(t -> executor.submit(t));
		System.out.println("All submited");
		
		long duration = System.currentTimeMillis() - start;
		
//		if (duration > 100000) {
//			executor.shutdown();
//		}

		System.out.println("Time in Milliseconds: " + duration);

	}

	private static void version2() {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Collection<Runnable> runables = new ArrayList<>();
	}
}
