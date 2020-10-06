package excercise_thread_oom;

import java.util.ArrayList;
import java.util.List;

public class demoThreadOom {

	public static void main(String[] args) {

		createArrayOfHell c = new createArrayOfHell();
		List<createArrayOfHell> list = new ArrayList<createArrayOfHell>();
		for (int i = 0; i <= 100; i++) {
			list.add(c);
		}
		list.forEach(t -> {
			t.run();
		});

	}
}
