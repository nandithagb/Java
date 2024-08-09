package Stacks_and_Queues;
import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> stack = new Stack<>();
		stack.push(34);
		stack.push(4);
		stack.push(14);
		stack.push(24);
		stack.push(3344);
		stack.push(84);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		Queue <Integer> queue = new LinkedList<>();
		queue.add(3);
		queue.add(13);
		queue.add(23);
		queue.add(33);
		queue.add(43);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		Deque <Integer> deque = new ArrayDeque<>();
		
		

	}

}
