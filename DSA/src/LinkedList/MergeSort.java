package LinkedList;



public class MergeSort {
	private ListNode head;
	private ListNode tail;
	
	 public ListNode sortList(ListNode head) {
	        if(head==null && head.next==null) {
	        	return head;
	        }
	        ListNode mid= middleNode(head);
	        ListNode left= sortList(head);
	        ListNode right= sortList(head);
	        return mergeTwoLists(left,right);
		 
		 
	    }
	
	
	
	
	
	
	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode dummy = new ListNode();
	        ListNode cur=dummy;
	        while(list1!=null && list2!=null){
	            if(list1.val<list2.val){
	                cur.next=list1;
	                list1=list1.next;
	            }
	            else{
	                cur.next=list2;
	                list2=list2.next;
	            }
	            cur=cur.next;
	        }
	        cur.next=(list1!=null)?list1:list2;
	        return dummy.next;

	        

	    }
	 public ListNode middleNode(ListNode head) {
	        ListNode slow= head;
	        ListNode fast=head;
	        while(fast!=null && fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	           }
	        return slow;
	 }
	 private class ListNode{
			private int val;
			private ListNode next;
			public ListNode() {
				// TODO Auto-generated constructor stub
			}
			public ListNode(int val) {
				this.val=val;
			}
		}
}
