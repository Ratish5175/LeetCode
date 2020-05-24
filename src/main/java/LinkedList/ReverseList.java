package LinkedList;

public class ReverseList {
	 ListNode newHead = null;
	public ListNode reverse(ListNode head)
	{
	
		if(head !=null) {
			reverse(head.next);
			if(newHead==null)
			{
				newHead = head; 
				newHead.next= null;
			}
			else
			{
				ListNode prev = newHead;
						
				while (prev.next!=null) {
					prev= prev.next;
				}
				prev.next= head;
				prev = prev.next;
				prev.next = null;
			}
		}
		else
		{
			
			return null ;
		}
		return newHead;
		
	
	}
	
    @SuppressWarnings("unused")
	public ListNode reverse(ListNode head, int a)
    {
    	ListNode prev = null;
    	ListNode temp= null; 
    	
    		for(ListNode iter = head; iter!=null;)
    		{
    		 	if(prev ==null) {
    	    		prev=iter;
    	    		iter=iter.next;
    	    		prev.next=null;
    		 	}
    		 	else
    		 	{
    		 		temp = iter;
    		 		iter=iter.next;
    		 		temp.next = prev;
    		 		prev = temp;
    		 	}
    		}
    
    	return prev;
    }
	public static void main(String[] args)
	{
		ReverseList reverseList
		= new ReverseList();
		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next=null;
		for(ListNode iter = head; iter!=null;iter=iter.next)
			System.out.println(iter.val);
		ListNode newHead= reverseList.reverse(head);
		for(ListNode iter = newHead; iter!=null;iter=iter.next)
			System.out.println(iter.val);
		
		
		
	}
}
