package com.excercise.future.oom2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class DemoThreadApp {
	
	//Gib der Maschine so viel Speicher, dass mindestens 3 Threads durchlaufen
	//Analysiere das Ergebnis mit den verschiedenen Threadausführungen

	public static void main(String[] args) {
		new DemoThreadApp().doSomething(Executors.newSingleThreadExecutor());
		new DemoThreadApp().doSomething(Executors.newFixedThreadPool(2));
		new DemoThreadApp().doSomething(Executors.newWorkStealingPool());
		new DemoThreadApp().doSomething(Executors.newCachedThreadPool());
	}
	
	public void doSomething(ExecutorService executor) {
		
		List<String> list = new ArrayList<String>();
		List<Future<String>> listOfFutures = new ArrayList<Future<String>>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			Future<String> future = new ArrayOfHellFutureBuilder(executor).build();
			listOfFutures.add(future);
		}

		boolean anyMatch = listOfFutures.stream().anyMatch(future -> !future.isDone());
		
		while(anyMatch) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		listOfFutures.forEach((Future<String> future) -> {
			String s = null;
			try {
				s = future.get();
			} catch (InterruptedException | ExecutionException e) {
				throw new OwnException(e);
			}
			list.add(s);
		});
		
		

		list.forEach(System.out::println);

		long duration = System.currentTimeMillis() - start;
		System.out.println("Time in Milliseconds: " + duration);
		executor.shutdown();
	}
	
	private class OwnException extends RuntimeException{
		private static final long serialVersionUID = 1L;

		OwnException(Throwable t){
			super(t);
		}
		
	}
}

