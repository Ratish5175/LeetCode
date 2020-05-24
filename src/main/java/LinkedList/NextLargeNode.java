package LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextLargeNode {

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
		
		NextLargeNode nextLargeNode = new NextLargeNode();
		nextLargeNode.nextLargerNodes(head);

	}
    public int[] nextLargerNodes(ListNode head) {
        
        Stack<ListNode> s = new Stack<ListNode>();
        int c=0;
        for(ListNode ptr = head ;ptr.next!=null;ptr=ptr.next)
        {
            s.push(ptr);
            c++;
        }
        int [] arr = new int [c+1];
        int max = Integer.MIN_VALUE;
        c=0;
        ListNode elem=null;
        while(!s.isEmpty()){
            elem=s.pop();
            if(max<elem.val)max=elem.val;
            if(elem.val!=max)arr[c++]=max;
            else arr[c++]=0;
        }
        int start =0;
        int end = arr.length -1;
        while (start<=end)
        {
        	int temp = arr[start];
        	arr[start++]=arr[end];
        	arr[end--]= temp;
        }
        return  arr;
    }
}
