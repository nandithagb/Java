package LinkedList;


public class CycleLinkedQuestions {
	 public boolean hasCycle(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;
	        while(fast!=null && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow){
	                return true;
	            }
	        }
	        return false;
	    }
	 public int hasCyclecount(ListNode head) {
	        ListNode fast=head;
	        ListNode slow=head;
	        while(fast!=null && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow){
	                ListNode temp=slow;
	                int length=0;
	                do {
	                	temp=temp.next;
	                	length++;
	                }while(temp!=slow);
	                return length;
	            }
	        }
	        return 1;
	    }
	 
	 
	 
	 
	 // reverse linked list 2 leetcode questionss
	 
	 public ListNode reverseBetween(ListNode head, int left, int right) {
	        if(left==right) {
	        	return head;
	        	
	        }
	        ListNode current=head;
	        ListNode prev=null;
	        for(int i=0; current!=null&& i<left-1;i++) {
	        	prev=current;
	        	current=current.next;
	        }
	        ListNode last=prev;
	        ListNode newend=current;
	        
	        
	        // reverse between left and right
	        ListNode next=current.next;
	        for(int i=0;current!=null && i<right-left+1;i++) {
	        	current.next=prev;
				prev=current;
				current=next;
				if(next!=null) {
					next=next.next;
				}
			
	        }
	        if(last!=null) {
	        	last.next=prev;
	        }
	        else {
	        	head=prev;
	        }
	        newend.next=current;
	        return head;
	        
	        
	        
	    }
	 public ListNode reverseList(ListNode head) {
	        if(head==null){
	            return head;
	        }
	        ListNode prev=null;
			ListNode present = head;
			ListNode next = present.next;
	        
			while(present!=null) {
				present.next=prev;
				prev=present;
				present=next;
				if(next!=null) {
					next=next.next;
				}
				
			}
			return prev;
	    }
	 public boolean isPalindrome(ListNode head) {
	        ListNode mid= middleNode(head);
	        ListNode secondhead= reverseList(mid);
	        ListNode rereversalhead = secondhead;
	        while(head!=null && secondhead!=null) {
	        	if(head.val!=secondhead.val) {
	        		break;
	        	}
	        	head=head.next;
	        	secondhead=secondhead.next;
	        	
	        }
	        reverseList(rereversalhead);
	        return head==null || secondhead==null;
	    }
	 
	 public ListNode detectCycle(ListNode head) {
	        int length=0;
	        ListNode fast=head;
	        ListNode slow=head;
	        while(fast!=null && fast.next!=null){
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow){
	                length=hasCyclecount(slow);
	                break;
	            }
	        }
	        ListNode f= head;
	        ListNode s= head;
	        if(length==0) {
	        	return null;
	        }
	        while(length!=0) {
	        	s=s.next;
	        	length--;
	        }
	        while(f!=s) {
	        	s=s.next;
	        	f=f.next;
	        }
	        return s;
	    }
	 
	 
	 /// happy number google question
	 
	 public boolean isHappy(int n) {
		 
		 int slow=n;
		 int fast=n;
		 do {
			 slow=square(n);
			 fast=square(square(n));
		 }while(slow!=fast);
		 return slow==1;
		 
	    }
	 private int square (int n) {
		 int ans=0;
		 while(n>0) {
			 int rem=n%10;
			 ans+=rem*rem;
			 n=n/10;
			 
		 }
		 return ans;
	 }
	 
	 
	 
	 
	 
	 // middle of the linked list
	 public ListNode middleNode(ListNode head) {
	        ListNode slow= head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	           }
	        return slow;
	 }
	 
	 
	 // rotate linked listttt k times
	 
	 
	 public ListNode rotateRight(ListNode head, int k) {
	        
		 if(k<=0 && head== null && head.next==null) {
			 return head;
		 }
		 ListNode last=head;
		 int length=1;
		 while(last.next!=null) {
			 last=last.next;
			 length++;
		 }
		 last.next=head;
		 
		 int rot= k%length;
		 int skip=length-rot;
		 ListNode newlast=head;
		 for(int i=0;i<skip-1;i++) {
			 newlast=newlast.next;
		 }
		 head=newlast.next;
		 newlast.next=null;
		 return head;
		 
	    }
	 
	 
	 
	 
	 
	 
	 private class ListNode{
			private int val;
			private ListNode next;
			public ListNode(int val) {
				this.val=val;
			}
		}
	
}

