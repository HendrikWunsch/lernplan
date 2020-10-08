package com.excercise.thread.oom;

import java.util.Random;

public class CreateArrayOfHell implements Runnable {

	int min = 1_000_000_000;

	@Override
	public void run() {
		Random r = new Random();
		int[] intA = new int[r.nextInt(min) + min];
		intA[0] = r.nextInt(min) + min;
		System.out.println("Das Array enthält: " + intA[0]);
	}
}
