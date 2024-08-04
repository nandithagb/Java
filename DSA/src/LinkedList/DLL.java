package LinkedList;

import LinkedList.LL1.Node;

public class DLL {
	private Node head;
	private Node tail;
	private int size=0;
	public DLL() {
		// TODO Auto-generated constructor stub
		this.size=0;
	}
	public void insertfirst(int val) {
		Node node= new Node(val);
		node.next=head;
		node.prev=null;
		if(head!=null) {
			head.prev=node;
		}
		head=node;	
	}
	
	public void insertlast(int val) {
		Node node = new Node(val);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		node.next=null;
		temp.next=node;
		node.prev=temp;
		if(head==null) {
			node.prev= null;
			node=head;
			return;
		}	
	}
	public void insertval(int after,int val) {
		
		Node p = find(after);
		if(p==null) {
			System.out.println("doesnt exists");
			return;
		}
		Node node = new Node(val);
		node.next=p.next;
		p.next=node;
		node.prev=p;
		
		if(node.next!=null) {
			node.next.prev=node;
		}
		
		
	}
	public Node find(int val) {
		Node node= head;
		while(node!=null) {
			if(node.val==val) {
				return node;
			}
			node=node.next;
		}
		return null;
	}
	public void display() {
		Node temp=head;
		Node last=null;
		
		while(temp!=null) {
			System.out.print(temp.val+"-> ");
			last=temp;
			temp=temp.next;
		}
		System.out.println("END");
		System.out.println("PRINT IN THE REVRESE ORDER");
		while(last!=null) {
			System.out.print(last.val+"->");
			last=last.prev;
		}
		System.out.println("STRAT");
	}
	
	private class Node{
		private int val;
		private Node next;
		private Node prev;
		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val=val;
		}
	
	}
	
	
	
}
