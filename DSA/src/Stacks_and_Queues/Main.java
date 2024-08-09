package Stacks_and_Queues;

public class Main {

	public static void main(String[] args) throws Exception {
		CustomizableStack stack = new CustomizableStack();
		stack.push(9);
		stack.push(19);
		stack.push(29);
		stack.push(39);
		stack.push(49);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
