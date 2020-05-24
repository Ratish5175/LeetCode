package LinkedList;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode listNode = new ListNode(4);
		ListNode head = listNode;
		listNode.next = new ListNode(6);listNode = listNode.next;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next = new ListNode(7);listNode = listNode.next;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next = new ListNode(3);listNode = listNode.next;
		listNode.next = new ListNode(9);listNode = listNode.next;
		listNode.next = new ListNode(8);listNode = listNode.next;
		listNode.next=null;
		
		
		for(ListNode ptr = head ;ptr!=null;ptr=ptr.next) {
			System.out.print(ptr.val+ " ");
		}
		SortList sl = new SortList();
		head  = sl.sortList(head);
		for(ListNode ptr = head ;ptr!=null;ptr=ptr.next) {
			System.out.print(ptr.val+ " ");
		}	
		
	}
	public ListNode sortList(ListNode head) {
        
		ListNode nHead = null;
		ListNode tmp = head;
		for(ListNode ptr = head ;ptr!=null;ptr=tmp) {
			tmp = ptr.next;
			nHead = insert(ptr, nHead);
		}
		
        return nHead;
    }
    public ListNode insert(ListNode head , ListNode nHead){
        ListNode ptr = head;
    	if(nHead == null ) {
    		nHead=ptr;
    		nHead.next = null;
    	}
    	else {
    		if(ptr.val <= nHead.val) {
    			ptr.next = nHead;
    			nHead = ptr;
    		}
    		else {
    			ListNode pt = null;
    			for(pt = nHead ; pt.next!=null &&  pt.next.val<ptr.val;pt=pt.next);
    			ListNode temp = pt.next; 
    			pt.next = ptr;
    			ptr.next = temp;
    		}
    	}
    	
    	return nHead;
    }

}
