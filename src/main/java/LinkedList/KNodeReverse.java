package LinkedList;

import java.util.Stack;

public class KNodeReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next = new ListNode(3);listNode = listNode.next;
		listNode.next = new ListNode(4);listNode = listNode.next;
		listNode.next = new ListNode(5);listNode = listNode.next;
		listNode.next = new ListNode(6);listNode = listNode.next;
		listNode.next = new ListNode(7);listNode = listNode.next;
		listNode.next = new ListNode(8);listNode = listNode.next;
		listNode.next=null;
		
		KNodeReverse kNodeReverse = new KNodeReverse();
		
		for(ListNode ptr = kNodeReverse.reverseKGroup(head, 4);ptr!=null;ptr=ptr.next) {
			System.out.print(ptr.val);
		}
	}
	
	  public ListNode reverseKGroup(ListNode head, int k) {
	        Stack<ListNode> s = new Stack<ListNode>();
	        
	        ListNode tail = null ;
	        ListNode nHead = null;
	        ListNode elem = null;
	        int c=0;
	        
	        for(ListNode ptr = head;ptr!=null;){
	            s.push(ptr);
	            ptr=ptr.next;
	            c++;
	            if(c==k){
	                c=0;
	                while(!s.isEmpty()){
	                    elem= s.pop();
	                    if(tail==null){
	                        nHead= elem;
	                        nHead.next = tail;
	                        tail=nHead;
	                        head=null;
	                    }
	                    else{
	                        tail.next=elem;
	                        tail=elem;
	                    }
	                }
	            }
	        }
	        
	        
	        tail.next =null;
	        while(!s.isEmpty()){
	            elem=s.pop();
	        }
	      //  System.out.print(elem.val);
	      ListNode ptr ;
	         for( ptr = nHead;ptr.next!=null;ptr=ptr.next){
	          //  System.out.print(ptr.val);
	            
	        }
	            //System.out.print(ptr.val);
	        ptr .next= elem;
	          // System.out.print( elem.val);
	      //  tail.next=elem;
	        return nHead;
	    }

}
