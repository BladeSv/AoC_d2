package adventofcode.day2.task1;

import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws IOException {
		FileProcesser fileProcesser = new FileProcesser();
		String s = fileProcesser.readFile();
		int[] z = fileProcesser.pars(s);
		Calculator calculator = new Calculator();
		int[] arr = calculator.calc(z);

		for (int k : arr) {

			System.out.println(k);
		}

	}

}
