package Stacks_and_Queues;

public class CustomizableStack {

	protected int[] data;
	private static final int DEFAULT_SIZE=10;
	public CustomizableStack(int size) {
		this.data=new int [size];
	}
	public CustomizableStack() {
		this(DEFAULT_SIZE);
	}
	int ptr=-1;
	public boolean push(int item) throws Exception {
		if(isfull()) {
			throw new Exception("cannot be insert elements"); 
		}
		ptr++;
		data[ptr]=item;
		return true;
	}
	public int pop() throws Exception {
		if(isempty()) {
			throw new Exception("cannot be pop elements"); 
			
		}
		return data[ptr--];
	}
	public int peek() throws Exception {
		if(isempty()) {
			throw new Exception("cannot be peek elements"); 
			
		}
		return data[ptr];
	}
	public boolean isfull() {
		return ptr==data.length-1;
	}
	public boolean isempty() {
		return ptr==-1;
	}
	
	
	
	
	
	
	
	
	

}
