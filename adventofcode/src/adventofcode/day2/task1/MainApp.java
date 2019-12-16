package adventofcode.day2.task1;

import java.io.IOException;
import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) throws IOException {
		FileProcesser fileProcesser = new FileProcesser();
		String s = fileProcesser.readFile();
		int[] z = fileProcesser.pars(s);
		outText(z);
		
		Calculator calculator = new Calculator();
		
		CalcEntity calcEntity =new CalcEntity(z, false);
		int[] arr2 = calculator.calc(calcEntity);

//		for (int k : arr) {
//
//			System.out.println(k);
//		}
		
		outText(arr2);
	}
	public static void outText(int[] arr) {
	StringBuilder builder =new StringBuilder();
	for(int i :arr) {
		
		builder.append(i).append(",");				
	}
	String str = builder.substring(0, builder.length()-1);
	System.out.println(str);
}

}
