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
	
	
	
	// recursion reverse
	
	
	public void reverse(Node node) {
		if(node==tail) {
			head=tail;
			return;
		}
		
		reverse(node.next);
		tail.next=node;
		tail=node;
		tail.next=null;
	}
	
	
	
	
	// in place reversal
	public void reversal() {
		if(size<2) {
			return;
		}
		Node prev=null;
		Node present=head;
		Node next=present.next;
		while(present!=null) {
			present.next=prev;
			prev=present;
			present=next;
			if(next!=null) {
				next=next.next;
			}
			
		}
		head=prev;
	}
	
	// reverse linked list at particular indexes
	
	

	
	
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
	
	
	
	
	
	
	
	
	
	
	// questionsssss
	// remove duplicates from sorted list
public void duplicates() {
	Node node= head;
	while(tail!=null) {
		if(node.val==node.next.val) {
			node.next=node.next.next;
			size--;
		}else {
			node=node.next;
		}
		
		tail=node;
		tail.next=null;
	}
}




// question2
// merge two sorted linked list

public static LL1 merge(LL1 first, LL1 second) {
	Node f= first.head;
	Node s= second.head;
	LL1 ans= new LL1();
	while(f!=null && s!=null) {
		if(f.val<s.val) {
			ans.insertatlast(f.val);
			f=f.next;
		}else {
			ans.insertatlast(s.val);
			s=s.next;
		}
	}
	
	while(f!=null) {
		ans.insertatlast(f.val);
		f=f.next;
	}
	while(s!=null) {
		ans.insertatlast(s.val);
		s=s.next;
	}
	return ans;
	
}




public static void main(String [] args) {
//	LL1 list= new LL1();
//	list.insertatlast(2);
//	list.insertatlast(12);
//	list.insertatlast(12);
//	list.insertatlast(32);
//	list.insertatlast(32);
//	list.insertatlast(32);
//	list.display();
//	list.duplicates();
//	list.display();
	
	LL1 first= new LL1();
	LL1 second = new LL1();
	first.insertatlast(1);
	first.insertatlast(3);
	first.insertatlast(5);
	
	
	second.insertatlast(1);
	second.insertatlast(2);
	second.insertatlast(9);
	second.insertatlast(14);
	LL1 ans= LL1.merge(first, second);
	ans.display();
	
}

}

