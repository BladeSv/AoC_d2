package adventofcode.day2.task1;

public class CalcEntity {

	private int arr[];
	private boolean stop;
	public CalcEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CalcEntity(int[] arr, boolean stop) {
		super();
		this.arr = arr;
		this.stop = stop;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
