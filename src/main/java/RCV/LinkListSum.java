package RCV;

import java.util.List;

// Add two numbers
 
public class LinkListSum {
	static ListNode res= null;
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode res = null,h1 , h2,h3 = null,prev = null;
    	h1 = l1;
    	h2 = l2;
    	int x,carry =0;
    	while(l1!=null && l2!=null)
    	{
    		x= (l1.val + l2.val+carry)%10 ;
    		carry = (l1.val + l2.val+carry)/10;
    		if(res==null)
    		{
    			res= new ListNode(x);
    			h3 = res;
    			res.next = null;
    		}
    		else
    		{
    			    
    			res = h3;
    			while(res!=null)
    			{
    				prev = res;
    				res = res.next;
    			}
    			
    			res= new ListNode(x);
    			prev.next = res;
    			res.next = null;
    		}
    			
    		l1= l1.next;
    		l2 = l2.next;
    	}
    	 
    	while(l1!=null )
    	{
    		x= (l1.val +carry)%10 ;
    		carry = (l1.val +carry)/10;
    		
    			    
    			res = h3;
    			while(res!=null)
    			{
    				prev = res;
    				res = res.next;
    			}
    			
    			res= new ListNode(x);
    			prev.next = res;
    			res.next = null;
    		
    			
    		l1= l1.next;
    		
    	}
    	while(l2!=null )
    	{
    		x= (l2.val +carry)%10 ;
    		carry = ( l2.val+carry)/10;
    		
    			    
    			res = h3;
    			while(res!=null)
    			{
    				prev = res;
    				res = res.next;
    			}
    			
    			res= new ListNode(x);
    			prev.next = res;
    			res.next = null;
    		
    			
    		l2= l2.next;
    		
    	}
    	
    	x= (carry)%10 ;
		carry = (carry)/10;
		
			    
			res = h3;
			while(res!=null)
			{
				prev = res;
				res = res.next;
			}
			if(x!=0) {
			res= new ListNode(x);
			prev.next = res;
			res.next = null;
			}
    	
    	return h3;
    }
    public static ListNode add(ListNode l1, ListNode l2, int carry)
    {
    	
    	int x=0;

    	if(l1!=null && l2!=null)
    	{
    		if( l1.next!=null)
    			carry =  (l1.next.val + l2.next.val+carry)/10;
    		res = add(l1.next,l2.next,carry);
    		x=(l1.val + l2.val+carry)%10 ;
    		res.val= x;
    	    
    	}
    	else if(l1!=null && l2==null)
    	{
    		
    		res = add(l1.next,null,carry);
    		x=(l1.val +carry)%10 ;
    		res.val= x;
    	    carry = (l1.val +carry)/10;
    	}
    	else if(l2!=null && l1==null)
    	{
    		
    		res = add(l2.next,null,carry);
    		x=(l2.val +carry)%10 ;
    		res.val= x;
    	    carry = (l2.val +carry)/10;
    	}    	
    	if(res == null ) {
    		res= new ListNode(x);
    		res.next = null;
    		
    	}
    	else if (res!=null) {
    		ListNode temp = new ListNode(x);
    		temp.next = res;
    		res = temp;
    	}
    	return res;
    	
    }

	private static int length(ListNode l1) {
		int c=0;
		for(ListNode head = l1;head.next!=null;head=head.next)
			c++;
		return c;
	}
	
	public static void main (String [] args)
	{
		ListNode l1= new ListNode(5);
		ListNode h1 = l1;
		l1.next = new ListNode(8);
		l1=l1.next;
		l1.next = null;
		
		
		ListNode l2= new ListNode(2);
		ListNode h2 = l2;
		l2.next = new ListNode(8);
		l2=l2.next;
		l2.next = null;
		
		ListNode res = add(h1,h2,0);// addTwoNumbers(h1, h2);
		
		for(ListNode as = res ; as!=null ; as= as.next)
		{
			System.out.print(as.val);
		}
		
	}
}
