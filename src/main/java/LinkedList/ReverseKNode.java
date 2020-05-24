package LinkedList;

import java.util.ArrayList;

public class ReverseKNode {

	public ListNode ReverseK(ListNode head , int k)
	{
		ListNode prev=null, temp,ptr;
		int c=0;
		ptr = head;
		while(ptr.next!=null && c!=k) {
			temp = ptr.next;
			if(ptr==head)
			{
				ptr.next=null;
			}
			else
				ptr.next=prev;
			prev = ptr;
			ptr= temp;
			c++;
		}
		
		
		return prev;
	}
	public ListNode GetTail(ListNode head) {
		ListNode ptr = null;
		for( ptr = head ;ptr.next!=null;ptr= ptr.next);
		return ptr;
	}
	public void Util(ListNode head , int k)
	{
		ListNode newHead = null, tail = null;
		while(true) {
			if(newHead == null)
				newHead = ReverseK(head, k);
			else {
				tail = GetTail(newHead,k);
				tail.next = ReverseK(head, k);
			}
		}
	}
	private ListNode GetTail(ListNode newHead, int k) {
		// TODO Auto-generated method stub
		ListNode ptr = null;
		int c =0;
		for( ptr = newHead ;ptr.next!=null;ptr= ptr.next) {
			c++;
			if(c==k)
				break;
		}
		return ptr;
	}
	public static void main(String []args) {
		ReverseKNode reverseKNode
		= new ReverseKNode();
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
		for(ListNode iter = head; iter!=null;iter=iter.next)
			System.out.print(iter.val+"->");
		
		System.out.print("\n");
		//reverseKNode.Util(head, 3);
		reverseKNode.Test(head, 3);
//		for(ListNode iter = reverseKNode.ReverseK(head, 3); iter!=null;iter=iter.next)
//			System.out.print(iter.val+"->");

	}
	
	public void Test(ListNode head , int k)
	{
		ArrayList<ListNode> headLoc = new ArrayList<ListNode>();
		ArrayList<ListNode> rem = new ArrayList<ListNode>();
		ArrayList<ListNode> revHeadLoc = new ArrayList<ListNode>();
		
		int c=0;
		ListNode ptr;
		for(ptr = head ;ptr.next!=null;ptr=ptr.next)
		{
			if(c%k==0)
				headLoc.add(ptr);
			c++;
		}
		if(c%k!=0)
			rem.add(headLoc.remove(c/k));
			
		for(ListNode pt : headLoc) {
			revHeadLoc.add(ReverseK(pt,3));
		}
	}
}
