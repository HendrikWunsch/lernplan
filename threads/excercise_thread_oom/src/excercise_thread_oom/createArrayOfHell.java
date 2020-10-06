package excercise_thread_oom;

import java.util.Random;

public class createArrayOfHell implements Runnable {

	int min = 1000000000;

	@Override
	public void run() {
		Random r = new Random();
		int[] intA = new int[r.nextInt(min) + min];
		intA[0] = r.nextInt(min) + min;
		System.out.println("Das Array enthält: " + intA[0]);

	}

}
