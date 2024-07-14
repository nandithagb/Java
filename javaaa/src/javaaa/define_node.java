package javaaa;

import java.util.*;

public class define_node {
	//Define the Node class for linked list
	Node head;
	Node tail;

	int size;
	class Node {
	 int data;
	 Node next;
	   Node(int x) {
	     data = x;
	       next = null;
	 
	}
	}
	
	public void insertfirst(int data) {
		Node node =new Node(data);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size++;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList <Integer> list= new LinkedList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		System.out.println(list);
		define_node list=new define_node();
		list.insertfirst(10);
		list.insertfirst(20);
		list.insertfirst(30);
		list.display();
	}
	
}
