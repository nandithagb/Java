package Stacks_and_Queues;

public class CircularQueueMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Circularqueue queue = new Circularqueue(5);
		queue.insert(3);
		queue.insert(13);
		queue.insert(23);
		queue.insert(33);
		queue.insert(43);
		queue.display();
		System.out.println(queue.remove());
		queue.insert(143);
		queue.display();

	}

}
