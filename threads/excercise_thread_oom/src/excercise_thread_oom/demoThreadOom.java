package excercise_thread_oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demoThreadOom {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);

		createArrayOfHell c = new createArrayOfHell();
		List<createArrayOfHell> list = new ArrayList<createArrayOfHell>();
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
