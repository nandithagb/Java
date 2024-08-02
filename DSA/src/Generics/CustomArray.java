package Generics;

import java.util.Arrays;

public class CustomArray {

	private int[] data;
	private static int DEFAULT_SIZE=10;
	private int size=0;
	public CustomArray() {
		// TODO Auto-generated constructor stub
		this.data=new int[DEFAULT_SIZE];
	}
	public void add(int num) {
		if(isfull()) {
			reset();
		}
		data[size++]=num;
	}
	private boolean isfull() {
		// TODO Auto-generated method stub
		return size== data.length;
		
	}
	public void reset() {
		int temp[]= new int[data.length*2];
		int in=0;
		for(int i: data) {
			temp[in]=i;
			in++;
		}
		data=temp;
		
		
	}
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		CustomArray cus= new CustomArray();
 		cus.add(3);
 		cus.add(5);
 		cus.add(7);
 		System.out.println((cus));

	}

}
