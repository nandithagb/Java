package Stacks_and_Queues;

public class CUstomQueue {
	
	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	public CUstomQueue(int size) {
		this.data=new int [size];
	}
	public CUstomQueue() {
		this(DEFAULT_SIZE);
	}
	int end=0;
	public boolean isfull() {
		return end==data.length;
	}
	public boolean isempty() {
		return end==0;
	}
	public boolean insert(int item) {
		if(isfull()) {
			return false;
		}
		data[end++]=item;
		return true;
	}
	public int remove() throws Exception  {
		if(isempty()) {
			throw new Exception ("queue is empty");
		}
		int removed=data[0];
		for(int i=1;i<end;i++) {
			data[i-1]=data[i];
		}
		end--;
		return removed;
	}
	public int front() throws Exception{
		if(isempty()) {
			throw new Exception ("queue is empty");
		}
		return data[0];
	}
	
	public void display() {
		for(int i=0;i<end;i++) {
			System.out.print(data[i]+"<-");
		}
		System.out.print("end");
	}
	
	
	
	
	
	
	
	
}
