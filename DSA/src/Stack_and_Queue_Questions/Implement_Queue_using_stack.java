package Stack_and_Queue_Questions;
import java.util.*;
public class Implement_Queue_using_stack {
	
}
class queueusingstack{
	private Stack <Integer> first ;
	private Stack <Integer> second ;
	public queueusingstack() {
		first = new Stack<>();
		second= new Stack<>();
	}
	public void insert(int item) {
		first.push(item);
	}
	public int remove() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int removed= second.pop();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return removed;
	}
	public int peeked () {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int peeked= second.peek();
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return peeked;
	}
	public boolean isEmpty() {
		return first.isEmpty();
	}
	
	
}
