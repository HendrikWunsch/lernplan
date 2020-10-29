package com.excercise.future.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class DemoThreadApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		

		List<String> list = new ArrayList<String>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			Future<String> future =  new ArrayOfHellFutureBuilder().build();
			String s = future.get();
			list.add(s);
		}
		
		list.forEach(System.out::println);

		long duration = System.currentTimeMillis()-start;
		System.out.println("Time in Milliseconds: "+ duration);
	}


}
