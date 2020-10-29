package com.excercise.future.oom;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ArrayOfHellCreator implements ArrayOfHellFuture {

	//private ExecutorService executor = Executors.newSingleThreadExecutor();
	//private ExecutorService executor = Executors.newFixedThreadPool(2);
//	private ExecutorService executor = Executors.newWorkStealingPool();
	private ExecutorService executor = Executors.newCachedThreadPool();

	static int min = 1_000_000_000;
	static int count = 0; // FixMe
	static long time = 0;

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		executor.shutdown();
		Thread t = Thread.currentThread();
		t.interrupt();
		return false;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get() throws InterruptedException, ExecutionException {
		long start = System.currentTimeMillis();
		count++;
		Random r = new Random();
		int[] intA = new int[r.nextInt(min)];
		intA[0] = r.nextInt(min) + min;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long duration = System.currentTimeMillis() - start;
		time = duration;
		String s = ("Count: " + count + " Das Array enthält: " + intA[0] + " Duration: " + duration);
		return s;
	}

	@Override
	public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	public void shutdown() {
		executor.shutdown();
		System.out.print("Thread:" + count + "was shutdown.");
	}

	public int getCount() {
		return count;
	}

	public long getTime() {
		return time;
	}

}
