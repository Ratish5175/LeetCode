package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Palindrome {
	
	
	public boolean IsPalindrome(ListNode head)
	{
		ListNode iter = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(iter!=null)
		{
			stack.push(iter.val);
			iter= iter.next;
			
		}
		iter = head;
		while(!stack.isEmpty()) {
			if(iter.val != stack.pop()) {
				return false;
			}
			iter= iter.next;
		}
		return true;
	}
	
	
	public static void main(String[] args)
	{
		Palindrome palindrome
		= new Palindrome();
		ListNode listNode = new ListNode(1);
		ListNode head = listNode;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next = new ListNode(2);listNode = listNode.next;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next = new ListNode(1);listNode = listNode.next;
		listNode.next=null;	
		System.out.print(palindrome.IsPalindrome(head));
	}
	
}
