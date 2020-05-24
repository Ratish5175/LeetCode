package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;

public class MaxContigousArray {

	public static void main(String[] args) {	
		int[] nums = {0,1};
		MaxContigousArray maxContigousArray = new MaxContigousArray();
		System.out.print(maxContigousArray.findMaxLength(nums));
	}

	public int findMaxLengthBF(int[] nums) {
		int c1=0,c0=0;
		int max=0;
		for(int i=0;i<=nums.length-1;i++) {
			c1=0;
			c0=0;
			for(int j=i;j<=nums.length-1;j++) {
				if(nums[j]==0)
					c0++;
				else
					c1++;
				if(c0==c1 && max<c0) {
					max = c0;
				}
			}
		}		
		return max*2;
	}
	
	// 2 d graph 
	public int findMaxLength(int[] nums) {
		String s = "abcdefg";
		s.substring(0,3);
		char [] t ; 
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(0, -1);
		int max =0;
		int level =0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1)
				level++;
			else
				level--;
			
			if(m.containsKey(level)) {
				max= Math.max(i - m.get(level), max);
			}
			else
				m.put(level,i);
		}
		return max;
	}
}

