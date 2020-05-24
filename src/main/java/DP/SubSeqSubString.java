package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class SubSeqSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubSeqSubString subSeqSubString = new SubSeqSubString(); 
		String t = "ahbgdc";
		String s = "acb";
		System.out.print(subSeqSubString.isSubsequence(s,t));
	}

	 public boolean isSubsequence(String s, String t) {
		 
		 List <Integer> temp = null;
		 HashMap <Character, List<Integer>> dic = new HashMap<Character, List<Integer>>();
		 for(int i=0;i<t.length();i++)
		 {
			 if(dic.get(t.charAt(i))==null)
				temp = new ArrayList<Integer>();
			else 
				temp  = dic.get(t.charAt(i));
		
			temp.add(i);
			dic.put(t.charAt(i),temp);
		 }
	     
		 int prev_ind =-1;
		
		 for(int i=0;i<s.length();i++) {
			 if(dic.get(s.charAt(i))==null)
				 return false;
			 else
			 {
				 List<Integer>temp1 =  dic.get(s.charAt(i));
				 boolean flag = false;
				 int c =0;
				 for(int j : temp1)
				 {
					 if(prev_ind==-1) {
						 flag = true;
						 prev_ind = j;
						 break;
					 }
					 else if(prev_ind < j) {
						 prev_ind =j;
						 flag = true;
						 break;
					 }	 
					 c++;
				 }
				 if(flag == true )
				 {
					// temp1.remove(c);
				 }
				 else
					 return false;
			 }
		 }
		 return true;
	  }
}
