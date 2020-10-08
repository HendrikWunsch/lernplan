package com.excercise.thread.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThreadOom {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		CreateArrayOfHell c = new CreateArrayOfHell();
		List<CreateArrayOfHell> list = new ArrayList<CreateArrayOfHell>();
		for (int i = 0; i <= 100; i++) {
			list.add(c);
		}
		
		executor.submit(() -> {
			list.forEach(t -> {
				t.run();
			});
		});
	}
}
