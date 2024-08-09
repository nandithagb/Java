package Stacks_and_Queues;

public class Circularqueue {
	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	public Circularqueue(int size) {
		this.data=new int [size];
	}
	public Circularqueue() {
		this(DEFAULT_SIZE);
	}
	protected int end=0;
	protected int front=0;
	private int size=0;
	public boolean isfull() {
		return size==data.length;
	}
	public boolean isempty() {
		return size==0;
	}
	public boolean insert(int item) {
		if(isfull()) {
			return false;
		}
		data[end++]=item;
		end=end%data.length;
		size++;
		return true;
	}
	public int remove() throws Exception  {
		if(isempty()) {
			throw new Exception ("queue is empty");
		}
		int removed= data[front++];
		front=front%data.length;
		size--;
		return removed;
	}
	public int front() throws Exception{
		if(isempty()) {
			throw new Exception ("queue is empty");
		}
		return data[front];
	}
	public void display() {
		if(isempty()) {
			System.out.println("the queue is empty");
			return;
		}
		int i=front;
		do {
			System.out.print(data[i]+"->");
			i++;
			i%=data.length;
		}while(i!=end);
		System.out.print("end");
	}
	

	
	
	
	
	
	
	
	
	
}
