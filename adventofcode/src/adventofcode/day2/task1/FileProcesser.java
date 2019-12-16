package adventofcode.day2.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileProcesser {

	public String readFile() throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Cobalt/2.txt"));
		String s = bufferedReader.readLine();
		return s;

	}

	public int[] pars(String s) {

		String[] sa = s.split(",");

		int[] i = Arrays.stream(sa).mapToInt(Integer::parseInt).toArray();
		return i;

	}

}
