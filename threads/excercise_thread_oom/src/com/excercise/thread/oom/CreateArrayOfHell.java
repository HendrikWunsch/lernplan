package com.excercise.thread.oom;

import java.util.Random;

public class CreateArrayOfHell implements Runnable {

	static int min = 100_000_000;
	static int count = 0;				//FixMe

	@Override
	public void run() {		
		//Erstelle CreateArrayOfHell Future 
		//String mit Info von System.out.print + 
		//sammeln in einer Collection damit alles 
		//auf einmal ausgegeben werden kann.
		//Run darf zwischen 0 und maximal 10 Sekunden laufen
		//Ausgabe am Ende soll Count,Arrayinhalt und Laufzeit enthalten.
		
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
		
		System.out.println("Count: " + count + " Das Array enthält: " + intA[0]);
		
//		while (true) {
//             if (Thread.currentThread().isInterrupted()) break;
//        }
	}
}
