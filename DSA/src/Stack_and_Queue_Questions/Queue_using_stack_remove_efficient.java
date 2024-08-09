package Stack_and_Queue_Questions;

import java.util.Stack;

public class Queue_using_stack_remove_efficient {

}
class queueusingstack_remove{
	private Stack <Integer> first ;
	private Stack <Integer> second ;
	public queueusingstack_remove() {
		first = new Stack<>();
		second= new Stack<>();
	}
	public void insert(int item) {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(item);
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
	}
	public int remove() {
//		while(!first.isEmpty()) {
//			second.push(first.pop());
//		}
//		int removed= second.pop();
//		while(!second.isEmpty()) {
//			first.push(second.pop());
//		}
		return first.pop();
	}
	public int peeked () {
//		while(!first.isEmpty()) {
//			second.push(first.pop());
//		}
//		int peeked= second.peek();
//		while(!second.isEmpty()) {
//			first.push(second.pop());
//		}
		return first.peek();
	}
	public boolean isEmpty() {
		return first.isEmpty();
	}
	
	
}
