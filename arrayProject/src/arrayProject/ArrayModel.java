package arrayProject;

import java.util.Random;

public class ArrayModel {
	private int[] arr;
	private int size;
	public ArrayModel(int size) {
		this.size = size;
		arr = new int[size];
		Random rand = new Random();
		for (int i = 0; i < this.size; i++) {
			arr[i] = rand.nextInt(99);
		}
		
	}
	
	public int getSize() {
		return size;
	}
	public int getElem(int index) {
		return arr[index];
	}
	

}
