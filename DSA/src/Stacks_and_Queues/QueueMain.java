package Stacks_and_Queues;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		CUstomQueue queue = new CUstomQueue();
		queue.insert(3);
		queue.insert(13);
		queue.insert(23);
		queue.insert(33);
		queue.insert(43);
		queue.display();
		System.out.println(queue.remove());
		queue.display();
		

	}

}
