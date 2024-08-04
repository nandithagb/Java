package LinkedList;



public class LL1 {
	
	private Node head;
	private Node tail;
	private int size;
	public LL1(){
		this.size=0;
	}
	public void insertatfirst(int val) {
		Node node = new Node(val);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
			
		}
		size+=1;
	}
	public void insertatlast(int val) {
		Node node = new Node(val) ;
		if(tail==null) {
			insertatfirst(val);
			return;
		}
		tail.next= node;
		tail=node;
		size++;
		
	}
	public void insertrec(int val,int index) {
		head= inserttrec(val,index,head);
		
	}
	private Node inserttrec(int val,int index,Node node) {
		if(index==0) {
			Node temp = new Node(val,node);
			size++;
			return temp;
		}
		node.next=inserttrec(val,index-1,node.next);
		return node;
	}
	public void insertatindex(int val,int index) {
		if(index==0) {
			insertatfirst(val);
			return;
		}
		if(index==size) {
			insertatlast(val);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node = new Node(val,temp.next);
		temp.next=node;
		size++;
		
	}
	public int deletefirst() {
		int val= head.val;
		head= head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return val;
		
		
	}
	public int deletelast() {
		if(size<=1) {
			return deletefirst();	
		}
		Node secondlast= get(size-2);
		int val= tail.val;
		tail=secondlast;
		tail.next=null;
		size--;
		return val;
	}
	public int deleteatindex(int index) {
		if(index==0) {
			return deletefirst();
		}
		if(index==size-1) {
			return deletelast();
		}
		Node prev= get(index-1);
		int val= prev.next.val;
		prev.next=prev.next.next;
		return val;
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
	public Node get(int index) {
		Node node= head;
		for(int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	public void display() {
		Node temp= head;
		while(temp!=null) {
			System.out.print(temp.val+"-> ");
			temp=temp.next;
		}
		System.out.println("end");
	}
	public class Node{
		private int val;
		private Node next;
		
		
		public Node(int val) {
			this.val=val;
		}
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
	

}

