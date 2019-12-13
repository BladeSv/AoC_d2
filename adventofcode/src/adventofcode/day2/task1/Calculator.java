package adventofcode.day2.task1;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	public static final int SUM = 1;
	public static final int MULTIPL = 2;
	public static final int STOP = 99;

	public static Map<Integer, SimpleCalc> func = new HashMap();
	{
		func.put(SUM, new Sum());
		func.put(MULTIPL, new Mult());
	}

	public int[] calc(int[] arr) {
		Boolean stop = false;
		int i = 0;
		int len = arr.length;
		while (i <= len && !stop && i != 99) {
			arr = circle(arr, i, stop);
			i = +4;

		}

		return arr;

	}

	private boolean isStop(int i) {
		return i == STOP ? true : false;
	}

	public int[] circle(int[] arr, int i, Boolean stop) {

		for (int z = 0; z <= 3; z++) {
			if (isStop(arr[z + i])) {
				stop = true;
				return arr;
			}
			switch (z) {

			case 0:
				if (!func.keySet().contains(arr[z + i])) {

					System.out.println("not correct func " + arr[z + i] + "index= " + (i + z));
					stop = true;
					return arr;
				}

			case 3:

				arr[i + 3] = func.get(arr[i]).calc(arr[i + 1], arr[i + 2]);

			}

		}
		return arr;
	}

	public class Sum implements SimpleCalc {

		@Override
		public int calc(int i, int y) {

			return i + y;
		}

	}

	public class Mult implements SimpleCalc {

		@Override
		public int calc(int i, int y) {

			return i * y;
		}

	}

}
