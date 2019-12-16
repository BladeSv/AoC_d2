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

	public int[] calc( CalcEntity arrC ) {
		
		int i = 0;
		int len = arrC.getArr().length;
		while (!arrC.isStop()) {
			arrC.setArr(circle(arrC, i));
			i = i+ 4;

		}

		return arrC.getArr();

	}

	private boolean isStop(int i) {
		return i == STOP ? true : false;
	}

	public int[] circle(CalcEntity arrC,  int i) {
		int[] arr= arrC.getArr();
		
		for (int z = 0; z <= 3; z++) {
		
			switch (z) {

			case 0:
				if (isStop(arr[z + i])) {
					arrC.setStop(true);
					System.out.println("index stop - "+(z+i)+" number- "+ arr[z+i]);
					return arr;
				}
				
				if (!func.keySet().contains(arr[z + i])) {

					System.out.println("not correct func " + arr[z + i] + "index= " + (i + z));
					arrC.setStop(true);
					return arr;
				}
				break;
			case 3:
				int num1 = arr[i + 1];
				int num2 = arr[i + 2];
				SimpleCalc doFunc = func.get(arr[i]);
				
				int aftetFunc= doFunc.calc(num1, num2);

				arr[arr[i + 3]] = aftetFunc;
				break;
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
